package com.example.duan1;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class HomeAdmin extends AppCompatActivity {
    RecyclerView recyclerViewFood;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_homeadmin);
        recyclerViewFood = findViewById(R.id.food_recycler);


    }
}
