package com.example.bookshelf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView Imageview;
    TextView nameView,authorView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        Imageview = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        authorView = itemView.findViewById(R.id.author);
    }
}
