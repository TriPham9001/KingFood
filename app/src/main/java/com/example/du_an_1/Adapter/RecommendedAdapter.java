package com.example.du_an_1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Model.Recommended;
import com.example.du_an_1.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.RecommendedViewHolder> {

    private List<Recommended> recommendedList;
    Context context;

    public RecommendedAdapter(List<Recommended> recommendedList, Context context) {
        this.recommendedList = recommendedList;
        this.context = context;
    }


    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {
        Recommended recommended = recommendedList.get(position);
        if (recommended == null){
            return;
        }
        holder.imgrecommended.setImageResource(recommended.getResourceId());
        holder.tvrecommended.setText(recommended.getTitle());

    }

    @NonNull
    @Override
    public RecommendedAdapter.RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommended_recycler_items,parent,false);
        return new RecommendedViewHolder(view);

    }

    @Override
    public int getItemCount() {
        if (recommendedList != null){
            return recommendedList.size();
        }
        return 0;
    }

    public class RecommendedViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView imgrecommended;
        private TextView tvrecommended;
        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);
            imgrecommended = itemView.findViewById(R.id.recommended_image);
            tvrecommended = itemView.findViewById(R.id.recommended_name);
        }
    }
}



