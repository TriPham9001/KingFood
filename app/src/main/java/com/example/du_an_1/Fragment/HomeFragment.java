package com.example.du_an_1.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.du_an_1.Adapter.MenuItemsAdapter;
import com.example.du_an_1.Adapter.PopularAdapter;
import com.example.du_an_1.Adapter.RecommendedAdapter;
import com.example.du_an_1.Model.MenuItems;
import com.example.du_an_1.Model.Popular;
import com.example.du_an_1.Model.Recommended;
import com.example.du_an_1.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ImageView img_add_drink;
    ImageView img_add_food;
    PopularAdapter popularAdapter;
    RecommendedAdapter recommendedAdapter;
    MenuItemsAdapter menuItemsAdapter;
    RecyclerView recyclerPopular;
    RecyclerView recyclerRecommended;
    RecyclerView recyclerMenuItems;
    List<Popular> mList;
    List<Recommended> List;
    List<MenuItems> nList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerPopular = view.findViewById(R.id.popular_recycler);
        recyclerRecommended = view.findViewById(R.id.recommended_recycler);
        recyclerMenuItems = view.findViewById(R.id.all_menu_recycler);

        popularAdapter = new PopularAdapter(mList, getContext());
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


        img_add_drink = view.findViewById(R.id.img_add_drink);
        img_add_food = view.findViewById(R.id.img_add_food);


        img_add_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFoodBottomDialog(false);

            }
        });


        img_add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFoodBottomDialog(true);
            }
        });
    }

    private void showFoodBottomDialog(Boolean isFood) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext());
        bottomSheetDialog.setContentView(R.layout.add_food_drink);
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        ImageView img_new_food = bottomSheetDialog.findViewById(R.id.img_add_new_fd);
        EditText ed_id_food = bottomSheetDialog.findViewById(R.id.id_fd);
        EditText ed_name_food = bottomSheetDialog.findViewById(R.id.name_fd);
        EditText ed_price_food = bottomSheetDialog.findViewById(R.id.ed_price_fd);
        EditText ed_describe_food = bottomSheetDialog.findViewById(R.id.ed_describe_fd);
        Button btn_save_food = bottomSheetDialog.findViewById(R.id.btn_save_fd);
        Button btn_cancel_food = bottomSheetDialog.findViewById(R.id.btn_cancel_fd);

        img_new_food.setImageResource(isFood == true ? R.drawable.humberger : R.drawable.ic_coffee);
        ed_id_food.setHint(getString(isFood ? R.string.id_food : R.string.id_drink));
        ed_name_food.setHint(isFood ? R.string.name_food : R.string.name_drink);
        ed_price_food.setHint(isFood ? R.string.price_food : R.string.price_drink);
        ed_describe_food.setHint(isFood ? R.string.describe_food : R.string.describe_drink);
        btn_save_food.setHint(isFood ? R.string.save : R.string.save);
        btn_cancel_food.setHint(isFood ? R.string.cancel : R.string.cancel);
        bottomSheetDialog.show();

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList = new ArrayList<>();
        mList.add(new Popular(R.drawable.comga, "Cơm Gà"));
        mList.add(new Popular(R.drawable.humberger, "Humberger"));
        mList.add(new Popular(R.drawable.ic_banhxeo, "Bánh Xèo"));
        mList.add(new Popular(R.drawable.comga, "Cơm Gà"));
        mList.add(new Popular(R.drawable.comchien, "Cơm chiên "));
        mList.add(new Popular(R.drawable.humberger, "Humberger"));
        mList.add(new Popular(R.drawable.ic_banhxeo, "Bánh Xèo"));
        mList.add(new Popular(R.drawable.comga, "Cơm Gà"));
        mList.add(new Popular(R.drawable.comchien, "Cơm chiên"));
        mList.add(new Popular(R.drawable.humberger, "Humberger"));
        mList.add(new Popular(R.drawable.ic_banhxeo, "Bánh Xèo"));

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
        nList.add(new MenuItems(R.drawable.comga, "Cơm Gà"));
        nList.add(new MenuItems(R.drawable.humberger, "Humberger"));
        nList.add(new MenuItems(R.drawable.ic_banhxeo, "Bánh Xèo"));
        nList.add(new MenuItems(R.drawable.comga, "Cơm Gà"));
        nList.add(new MenuItems(R.drawable.comchien, "Cơm chiên "));
    }
}
