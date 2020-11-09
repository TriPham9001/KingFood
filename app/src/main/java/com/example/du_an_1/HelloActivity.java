package com.example.du_an_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.du_an_1.Model.Food;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Iterator;

public class HelloActivity extends AppCompatActivity {
    ImageView imgLogo, imgFpoly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        final Animation buttonClick = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        Thread bamgio = new Thread() {


            public void run() {
                try {
                    sleep(2300);
                } catch (Exception e) {

                } finally {
                    Intent i = new Intent(HelloActivity.this, OnBroardingActivity.class);
                    startActivity(i);
                }
            }
        };
        bamgio.start();
    }
    protected void onPause() {
        super.onPause();
        finish();
    }
}