package com.example.dynamic_auto_sell_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AdPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_page2);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter2 adapter = new ImageAdapter2(this);
        viewPager.setAdapter(adapter);
    }


}
