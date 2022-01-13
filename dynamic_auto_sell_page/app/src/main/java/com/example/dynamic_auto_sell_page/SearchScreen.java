package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchScreen extends AppCompatActivity {
    private Button buttonl1;
    private Button buttonl2;
    private Button buttonl3;
    private Button buttonl4;
    private Button buttonl5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);


        buttonl1 = (Button) findViewById(R.id.buttonl1);
        buttonl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page();
            }
        });

        buttonl2 = (Button) findViewById(R.id.buttonl2);
        buttonl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page1();
            }
        });

        buttonl3 = (Button) findViewById(R.id.buttonl3);
        buttonl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page2();
            }
        });
        buttonl4 = (Button) findViewById(R.id.buttonl4);
        buttonl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page3();
            }
        });
        buttonl5 = (Button) findViewById(R.id.buttonl5);
        buttonl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page4();
            }
        });

    }
    public void openactivity_ad_page(){
        Intent intent1 = new Intent(this, AdPage.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page1(){
        Intent intent1 = new Intent(this, AdPage1.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page2(){
        Intent intent1 = new Intent(this, AdPage2.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page3(){
        Intent intent1 = new Intent(this, AdPage3.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page4(){
        Intent intent1 = new Intent(this, AdPage4.class);
        startActivity(intent1);
    }
}
