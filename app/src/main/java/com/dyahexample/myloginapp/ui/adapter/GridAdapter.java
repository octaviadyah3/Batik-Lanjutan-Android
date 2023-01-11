package com.dyahexample.myloginapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dyahexample.myloginapp.R;

import com.bumptech.glide.Glide;
import com.dyahexample.myloginapp.data.batik.BatikEntity;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private ArrayList<BatikEntity> listBatik;
    public GridAdapter(ArrayList<BatikEntity>list){
        this.listBatik = list;
    }

    @NonNull
    @Override
    public GridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_batik,parent,false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.GridViewHolder holder, int position) {
        BatikEntity batikEntity = listBatik.get(position);
        Glide.with(holder.itemView.getContext())
                .load(batikEntity.getGambar())
                .into(holder.imgBatik);


    }

    @Override
    public int getItemCount() {
        return listBatik.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBatik;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBatik = itemView.findViewById(R.id.imgKawung);
        }
    }
}
