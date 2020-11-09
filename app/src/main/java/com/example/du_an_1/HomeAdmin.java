package com.example.du_an_1;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Adapter.MenuItemsAdapter;
import com.example.du_an_1.Database.FireBaseHelper;
import com.example.du_an_1.Model.MenuItems;
import com.example.du_an_1.R;

import java.util.List;

public class HomeAdmin extends AppCompatActivity {
    private RecyclerView recyclerViewFood;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_homeadmin);

        recyclerViewFood = findViewById(R.id.food_recycler);
        new FireBaseHelper().getDataFood(new FireBaseHelper.DataStatus() {
            @Override
            public void DataIsLoaded(List<MenuItems> menuItemsList, List<String> keys) {
                new MenuItemsAdapter().setConfig(recyclerViewFood,HomeAdmin.this,menuItemsList,keys);
            }

            @Override
            public void DataIsInsert() {

            }

            @Override
            public void DataIsUpdated() {

            }

            @Override
            public void DataIsDeleted() {

            }
        });
    }
}
