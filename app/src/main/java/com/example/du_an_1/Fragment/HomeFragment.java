package com.example.du_an_1.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Adapter.MenuItemsAdapter;
import com.example.du_an_1.Adapter.PopularAdapter;
import com.example.du_an_1.Adapter.RecommendedAdapter;
import com.example.du_an_1.HelloActivity;
import com.example.du_an_1.Model.Food;
import com.example.du_an_1.Model.MenuItems;
import com.example.du_an_1.Model.Popular;
import com.example.du_an_1.Model.Recommended;
import com.example.du_an_1.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class HomeFragment extends Fragment {

    PopularAdapter popularAdapter;
    RecommendedAdapter recommendedAdapter;
    MenuItemsAdapter menuItemsAdapter;
    View view;
    RecyclerView recyclerPopular;
    RecyclerView recyclerRecommended;
    RecyclerView recyclerMenuItems;
    List<Popular> mList;
    List<Recommended> List;
    List<MenuItems> nList;
    ArrayList<Popular> arrayListNameFood;

    private void setContentView(int activity_main) {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_home,container,false);

        recyclerPopular = view.findViewById(R.id.popular_recycler);
        recyclerRecommended = view.findViewById(R.id.recommended_recycler);
        recyclerMenuItems = view.findViewById(R.id.all_menu_recycler);

        popularAdapter = new PopularAdapter(mList,getContext());
        recyclerPopular.setAdapter(popularAdapter);
        recyclerPopular.setLayoutManager(new LinearLayoutManager(getActivity()));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerPopular.setLayoutManager(layoutManager);


        recommendedAdapter = new RecommendedAdapter(List, getContext());
        recyclerRecommended.setAdapter(recommendedAdapter);
        recyclerRecommended.setLayoutManager(new LinearLayoutManager(getActivity()));
        LinearLayoutManager layoutManagerRecommended = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerRecommended.setLayoutManager(layoutManagerRecommended);

        menuItemsAdapter = new MenuItemsAdapter(nList, getContext());
        recyclerMenuItems.setAdapter(menuItemsAdapter);
        recyclerMenuItems.setLayoutManager(new LinearLayoutManager(getActivity()));
        LinearLayoutManager layoutManagerMenuItems = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerRecommended.setLayoutManager(layoutManagerMenuItems);


//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("Food");
//
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//            if(snapshot.exists()){
//                Iterable<DataSnapshot> snapshots = snapshot.getChildren();
//                Iterator<DataSnapshot> iterator = snapshots.iterator();
//                while (iterator.hasNext()){
//                    DataSnapshot next = (DataSnapshot) iterator.next();
//                    Popular popular = next.getValue(Popular.class);
//                    arrayListNameFood.add(popular);
//                    popularAdapter = new PopularAdapter(arrayListNameFood,getContext());
//                    recyclerPopular.setAdapter(popularAdapter);
//                    recyclerPopular.setLayoutManager(new LinearLayoutManager(getActivity()));
//                    LinearLayoutManager layoutManagerr = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
//                    recyclerPopular.setLayoutManager(layoutManagerr);
//                }
//            }
//        }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                Log.w("Firebase","Failed to read value", error.toException());
//            }
//        });
        setData();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        setData();
    }
    public void setData(){
        mList = new ArrayList<>();
        mList.add(new Popular(R.drawable.comga,"Cơm Gà") );
        mList.add(new Popular(R.drawable.humberger,"Humberger") );
        mList.add(new Popular(R.drawable.ic_banhxeo,"Bánh Xèo") );
        mList.add(new Popular(R.drawable.comga,"Cơm Gà") );
        mList.add(new Popular(R.drawable.comchien, "Cơm chiên "));
        mList.add(new Popular(R.drawable.humberger,"Humberger") );
        mList.add(new Popular(R.drawable.ic_banhxeo,"Bánh Xèo") );
        mList.add(new Popular(R.drawable.comga,"Cơm Gà") );
        mList.add(new Popular(R.drawable.comchien, "Cơm chiên"));
        mList.add(new Popular(R.drawable.humberger,"Humberger") );
        mList.add(new Popular(R.drawable.ic_banhxeo,"Bánh Xèo") );

        List = new ArrayList<>();
        List.add(new Recommended(R.drawable.comga, "Cơm Gà"));
        List.add(new Recommended(R.drawable.humberger, "Humberger"));
        List.add(new Recommended(R.drawable.comga, "Cơm Gà"));
        List.add(new Recommended(R.drawable.comchien, "Cơm chiên "));
        List.add(new Recommended(R.drawable.humberger, "Humberger"));
        List.add(new Recommended(R.drawable.comga, "Cơm Gà"));
        List.add(new Recommended(R.drawable.humberger, "Humberger"));
        List.add(new Recommended(R.drawable.comchien, "Cơm chiên "));

        nList = new ArrayList<>();
        nList.add(new MenuItems(R.drawable.comga,"Cơm Gà") );
        nList.add(new MenuItems(R.drawable.humberger,"Humberger") );
        nList.add(new MenuItems(R.drawable.ic_banhxeo,"Bánh Xèo") );
        nList.add(new MenuItems(R.drawable.comga,"Cơm Gà") );
        nList.add(new MenuItems(R.drawable.comchien, "Cơm chiên "));
    }
}
