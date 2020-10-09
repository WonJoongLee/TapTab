package com.example.taptabfe.Adapter.MainViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taptabfe.Adapter.MainRecAdapter.RecAdapter;
import com.example.taptabfe.Adapter.MainRecAdapter.Tablet;
import com.example.taptabfe.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Frame_KSJ extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Tablet> items;

    //firebase를 위한 변수 선언
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.item_viewpager, container, false);

        //initDataset();

        Context context = view.getContext();  //view를 context로 얻어옴
        recyclerView = (RecyclerView) view.findViewById(R.id.main_recyclerView);
        recyclerView.setHasFixedSize(true);  //리사이클러뷰 기존성능 강화
        layoutManager = new LinearLayoutManager(context);
        //layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        items = new ArrayList<>();

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("User");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener(){  //read from my database
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                items.clear();  //현재 arraylist를 먼저 비워준후
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){  //snapshot을 초기값으로 해서 반복함
                     Tablet tablet = snapshot.getValue(Tablet.class);  //Tablet.class로부터 데이터를 가져와서 tablet에 넣어준다
                     items.add(tablet);  //items에 넣어준다
                }
                adapter.notifyDataSetChanged();  //새로고침
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {  //error occured when bring DB data
                Log.e("Frame_KSJ", String.valueOf(databaseError.toException()));
            }
        });

        adapter = new RecAdapter(items, context);
        recyclerView.setAdapter(adapter);

        return view;
    }

    /*private void initDataset(){
        items.clear();
        items.add(new Tablet("10호기", "1", "Galaxy Tab S8"));
        items.add(new Tablet("11호기", "1", "Galaxy Tab S9"));
        items.add(new Tablet("12호기", "1", "Galaxy Tab S10"));
    }*/
}
