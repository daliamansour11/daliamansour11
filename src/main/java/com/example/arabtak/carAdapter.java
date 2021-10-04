package com.example.arabtak;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class carAdapter extends RecyclerView.Adapter{
    public carAdapter(View v) {
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_car_item, null, false);

        carviewHolder carviewHolder = new carviewHolder(v);
        return carviewHolder;
    }


    public carAdapter() {
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
     Cars c = Cars.get(position);
     holder.getItemId();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class carviewHolder extends RecyclerView.ViewHolder{

        TextView tv_brand;
        View img;

        TextView tv_year;
        TextView tv_status;

        public carviewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
             tv_brand= itemView.findViewById(R.id.brand);
             tv_year= itemView.findViewById(R.id.year);
             tv_status= itemView.findViewById(R.id.status);
             img= itemView.findViewById(R.id.image_car);


        }
    }
}
