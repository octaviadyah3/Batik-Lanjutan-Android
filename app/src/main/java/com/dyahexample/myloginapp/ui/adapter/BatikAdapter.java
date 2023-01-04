package com.dyahexample.myloginapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.BatikEntity;

import java.util.ArrayList;

public class BatikAdapter extends RecyclerView.Adapter<BatikAdapter.ListViewHolder> {
private ArrayList<BatikEntity> listMovie;

    @NonNull
    @Override
    public BatikAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_batik,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BatikAdapter.ListViewHolder holder, int position) {
    final BatikEntity batikEntity = listBatik.get(position);
    Glide.with(holder.itemView.getContext())
        .load(BatikEntity.getPoster())
        ,into(holder,imgPoster);
    holder.tvName.setText(batikEntity.getName());
    holder.tvRelease.setText(batikEntity)
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder {
    }
}
