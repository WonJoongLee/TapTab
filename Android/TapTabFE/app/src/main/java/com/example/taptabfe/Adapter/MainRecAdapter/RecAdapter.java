package com.example.taptabfe.Adapter.MainRecAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taptabfe.R;

import java.util.ArrayList;

/*RecyclerView Adapter*/
public class RecAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public ArrayList<Tablet> items = new ArrayList<>();
    private Context context;

    public RecAdapter(ArrayList<Tablet> items, Context context){
        this.items = items;
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainrecyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String string1 = "대여불가";
        String string2 = "대여가능";
        holder.item_deviceName.setText(items.get(position).getDevice_name());
        holder.item_nthDevice.setText(items.get(position).getId());
        if(items.get(position).getRental() == 0)
            holder.item_rental.setText(string1);
        else
            holder.item_rental.setText(string2);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_nthDevice;
        TextView item_deviceName;
        TextView item_rental;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.item_deviceName = itemView.findViewById(R.id.item_deviceName);
            this.item_nthDevice = itemView.findViewById(R.id.item_nthDevice);
            this.item_rental = itemView.findViewById(R.id.item_rental);
        }

    }
}
