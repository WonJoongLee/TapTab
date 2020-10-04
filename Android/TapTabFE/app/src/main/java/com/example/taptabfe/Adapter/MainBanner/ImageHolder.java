package com.example.taptabfe.Adapter.MainBanner;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageHolder extends RecyclerView.ViewHolder {

    public ImageView imageview;

    public ImageHolder(@NonNull View itemView) {
        super(itemView);
        this.imageview = (ImageView)itemView;
    }

}
