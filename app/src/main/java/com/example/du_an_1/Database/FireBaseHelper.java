package com.example.du_an_1.Database;

import androidx.annotation.NonNull;

import com.example.du_an_1.Model.MenuItems;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FireBaseHelper {
    private FirebaseDatabase Database;
    private DatabaseReference databaseReference;
    private ArrayList<MenuItems> listmenuItems = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<MenuItems> menuItemsList, List<String> keys);
        void DataIsInsert();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public FireBaseHelper(){
        Database = FirebaseDatabase.getInstance();
        databaseReference = Database.getReference("Food");
    }

    public void getDataFood(final DataStatus dataStatus){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listmenuItems.clear();
                List<String> keys = new ArrayList<>();
                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    MenuItems menuItems = keyNode.getValue(MenuItems.class);
                    listmenuItems.add(menuItems);
                }
                dataStatus.DataIsLoaded(listmenuItems,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
