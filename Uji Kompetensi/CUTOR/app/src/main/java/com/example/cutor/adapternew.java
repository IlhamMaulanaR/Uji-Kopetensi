package com.example.cutor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapternew extends RecyclerView.Adapter<adapternew.ViewHolder>{

    List<model> aModelList;

    public adapternew(List<model> modelberandaList) {
        this.aModelList = modelberandaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvNama.setText(aModelList.get(i).getMenu());
        viewHolder.tvAlamat.setText(aModelList.get(i).getKategori());
        Glide.with(viewHolder.itemView.getContext())
                .load("" + aModelList.get(i).getGambar())
                .into(viewHolder.imgItem);

//        ViewHolder.itemView.
    }

    @Override
    public int getItemCount() {
        return aModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNama, tvAlamat;
        ImageView imgItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvnama);
            tvAlamat = itemView.findViewById(R.id.tvalamat);
            imgItem = itemView.findViewById(R.id.imgitem);

        }

    }

}
