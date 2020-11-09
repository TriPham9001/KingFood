package com.example.du_an_1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Model.MenuItems;
import com.example.du_an_1.Model.Recommended;
import com.example.du_an_1.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MenuItemsAdapter extends RecyclerView.Adapter<MenuItemsAdapter.RecommendedViewHolder> {

    private Context mContext;
    private MenuItemsAdapter menuItemsAdapter;
    private List<MenuItems> menuItemsList;
    private List<String> menuKeys;
    Context context;

    public MenuItemsAdapter() {
    }

    public void setConfig(RecyclerView recyclerView, Context context, List<MenuItems> menuItemsList, List<String> keys){
        mContext = context;
        menuItemsAdapter = new MenuItemsAdapter(menuItemsList, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(menuItemsAdapter);
    }

    public MenuItemsAdapter(List<MenuItems> menuItemsList, List<String> menuKeys) {
        this.menuItemsList = menuItemsList;
        this.menuKeys = menuKeys;
    }

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
        holder.Bind(menuItemsList.get(position),menuKeys.get(position));
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
        private String key;
        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);
            imgallitems = itemView.findViewById(R.id.all_menu_image);
            txtallitems = itemView.findViewById(R.id.all_menu_name);
        }
        public void Bind(MenuItems menuItems, String key){
            imgallitems.setBackgroundResource(R.drawable.comga);
            txtallitems.setText(menuItems.getTitle());
            this.key = key;
        }
    }
}



