package com.dyahexample.myloginapp.ui.adapter.teknik;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dyahexample.myloginapp.R;
import com.dyahexample.myloginapp.data.teknik.TeknikEntity;
import com.dyahexample.myloginapp.ui.teknik.TeknikDetail;

import java.util.ArrayList;


public class TeknikGridAdapter extends RecyclerView.Adapter<TeknikGridAdapter.GridViewHolder>{
    private ArrayList<TeknikEntity> listTeknik;
    public TeknikGridAdapter(ArrayList<TeknikEntity>list) {this.listTeknik = list; }

    @NonNull
    @Override
    public TeknikGridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teknik,parent,false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeknikGridAdapter.GridViewHolder holder, int position) {
        final TeknikEntity teknikEntity = listTeknik.get(position);
        Glide.with(holder.itemView.getContext())
                .load(teknikEntity.getTeknikGambar())
                .into(holder.imgTeknik);
        holder.txtTeknik.setText(teknikEntity.getTeknikBatik());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), TeknikDetail.class);
                intent.putExtra("TEKNIK",teknikEntity);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {return listTeknik.size();}

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgTeknik;
        TextView txtTeknik;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTeknik = itemView.findViewById(R.id.txt_teknik);
            imgTeknik = itemView.findViewById(R.id.imgTeknik);
        }
    }
}
