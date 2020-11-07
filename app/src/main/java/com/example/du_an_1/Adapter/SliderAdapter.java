package com.example.du_an_1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.du_an_1.R;

public class SliderAdapter extends PagerAdapter {

    Context ctx;

    public SliderAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slides_layout,container,false);


        ImageView logo=view.findViewById(R.id.logo);
        ImageView ind1=view.findViewById(R.id.ind1);
        ImageView ind2=view.findViewById(R.id.ind2);
        ImageView ind3=view.findViewById(R.id.ind3);

        TextView title=view.findViewById(R.id.title);
        TextView desc=view.findViewById(R.id.desc);


        switch (position)
        {
            case 0:
                logo.setImageResource(R.drawable.logo);
                ind1.setImageResource(R.drawable.seleted);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);
                title.setText(view.getResources().getString(R.string.welcom_king_food));
//                title.setText("WELCOME TO" +
//                        " THE KING FOOD");
                desc.setText(" Có phải bạn đang thèm món gì đó ");

                break;
            case 1:
                logo.setImageResource(R.drawable.ic_comchienxaobo);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.seleted);
                ind3.setImageResource(R.drawable.unselected);

                title.setText("ORDER LIỀN TAY");
                desc.setText("Bạn có thể thoả sức lựa những món ăn ngon và lạ ở đây," +
                        "chúng tôi có rất nhiều ưu đạt dành cho bạn");

                break;
            case 2:
                logo.setImageResource(R.drawable.images);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.seleted);

                title.setText("CÙNG TRẢI NGHIỆM NÀO");
                desc.setText("Chúng tôi sẽ nhanh chóng đến bên bạn");

                break;






        }


        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
