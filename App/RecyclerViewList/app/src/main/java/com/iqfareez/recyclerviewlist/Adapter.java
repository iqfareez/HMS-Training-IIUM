package com.iqfareez.recyclerviewlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList courseImg, courseName;
    Context context;


    // Constructor for initialization
    public Adapter(Context context, ArrayList courseImg, ArrayList courseName) {
        this.context = context;
        this.courseImg = courseImg;
        this.courseName = courseName;

    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int res = (int) courseImg.get(position);
        holder.images.setImageResource(res);
        holder.text.setText((String) courseName.get(position));


    }


    @Override
    public int getItemCount() {
        return courseName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            images = (ImageView) itemView.findViewById(R.id.courseImg);
            text = (TextView) itemView.findViewById(R.id.courseName);
        }

    }
}

