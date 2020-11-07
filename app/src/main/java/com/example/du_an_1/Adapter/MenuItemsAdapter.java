package com.example.du_an_1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Model.MenuItems;
import com.example.du_an_1.Model.Recommended;
import com.example.du_an_1.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MenuItemsAdapter extends RecyclerView.Adapter<MenuItemsAdapter.RecommendedViewHolder> {

    private List<MenuItems> menuItemsList;
    Context context;

    public MenuItemsAdapter(List<MenuItems> menuItemsList, Context context) {
        this.menuItemsList = menuItemsList;
        this.context = context;
    }


    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {
        MenuItems menuItems = menuItemsList.get(position);
        if (menuItems == null){
            return;
        }
        holder.imgallitems.setImageResource(menuItems.getResourceId());
        holder.txtallitems.setText(menuItems.getTitle());
    }

    @NonNull
    @Override
    public MenuItemsAdapter.RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.allmenu_recycler_items,parent,false);
        return new RecommendedViewHolder(view);

    }

    @Override
    public int getItemCount() {
        if (menuItemsList != null){
            return menuItemsList.size();
        }else{
            return 0;
        }
    }

    public class RecommendedViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgallitems;
        private TextView txtallitems;
        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);
            imgallitems = itemView.findViewById(R.id.all_menu_image);
            txtallitems = itemView.findViewById(R.id.all_menu_name);
        }
    }
}



