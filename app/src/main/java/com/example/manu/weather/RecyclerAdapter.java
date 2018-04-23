package com.example.manu.weather;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mDay;
        TextView mHighTemp;
        TextView mMinTemp;
        ImageView mIcon;
        public MyViewHolder(View itemView) {
            super(itemView);

            mDay = itemView.findViewById(R.id.day);
            mHighTemp = itemView.findViewById(R.id.max_temp);
            mMinTemp = itemView.findViewById(R.id.min_temp);
            mIcon = itemView.findViewById(R.id.weather_icon);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
