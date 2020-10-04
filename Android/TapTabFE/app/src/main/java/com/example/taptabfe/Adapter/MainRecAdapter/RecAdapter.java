package com.example.taptabfe.Adapter.MainRecAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taptabfe.R;

import java.util.ArrayList;

/*RecyclerView Adapter*/
public class RecAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public ArrayList<Tablet> items = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainrecyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivRes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
}
