package com.example.taptabfe.Adapter.MainViewPager;

import android.content.Context;
import android.os.Bundle;
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

import java.util.ArrayList;

public class Frame_YSJ extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Tablet> items = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item_viewpager, container, false);

        initDataset();

        Context context = view.getContext();
        RecyclerView recyclerView;
        recyclerView = (RecyclerView) view.findViewById(R.id.main_recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        RecAdapter adapter = new RecAdapter(items, context);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initDataset(){
        items.clear();
        items.add(new Tablet("1호기", "1", "Galaxy Tab A8 with S Pen"));
        items.add(new Tablet("2호기", "1", "Galaxy Tab S6"));
        items.add(new Tablet("3호기", "1", "Galaxy Tab S7"));
        items.add(new Tablet("4호기", "1", "Galaxy Tab S6 Lite"));
    }

}
