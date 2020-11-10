package com.example.duan1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1.Model.Popular;
import com.example.duan1.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder> {

    private List<Popular> mpopular;
    Context context;

    public PopularAdapter() {
    }

    public PopularAdapter(List<Popular> mpopular, Context context) {
        this.mpopular = mpopular;
        this.context = context;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.popular_recycler_items,parent,false);
        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {
        Popular popular = mpopular.get(position);
        if (popular == null){
            return;
        }

        holder.imgPopular.setImageResource(popular.getResourceId());
        holder.tvTitlePopular.setText(popular.getTitle());

    }

    @Override
    public int getItemCount() {
        if (mpopular != null){
            return mpopular.size();
        }
        return 0;
    }

    public class PopularViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView imgPopular;
        private TextView tvTitlePopular;
        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPopular = itemView.findViewById(R.id.img_popular);
            tvTitlePopular = itemView.findViewById(R.id.tv_title_popular);
        }
    }
}
