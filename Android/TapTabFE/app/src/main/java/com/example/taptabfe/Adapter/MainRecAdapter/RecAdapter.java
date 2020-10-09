package com.example.taptabfe.Adapter.MainRecAdapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taptabfe.R;

import java.util.ArrayList;

/*RecyclerView Adapter*/

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {

    public ArrayList<Tablet> items;
    private Context context;

    public RecAdapter(ArrayList<Tablet> items, Context context){
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public RecAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainrecyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecAdapter.ViewHolder holder, int position) {
        String string1 = "대여불가";
        String string2 = "대여가능";

        holder.item_deviceName.setText(items.get(position).getDevice_name());
        holder.item_nthDevice.setText(items.get(position).getId());
        if(items.get(position).getRental().equals("0")) {
            holder.item_rental.setText(string1);
            holder.itemView.setBackgroundColor(Color.parseColor("#a0a0a0"));
        }
            else
            holder.item_rental.setText(string2);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String curName = "확인 다음 페이지로 ";
                    Toast.makeText(view.getContext(), curName, Toast.LENGTH_SHORT).show();
                }
            });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_nthDevice;// = items.get(1).getDevice_name();
        TextView item_deviceName;
        TextView item_rental;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_deviceName = itemView.findViewById(R.id.item_deviceName);
            item_nthDevice = itemView.findViewById(R.id.item_nthDevice);
            item_rental = itemView.findViewById(R.id.item_rental);
        }

    }
}
