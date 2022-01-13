package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountScreen extends AppCompatActivity {
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page2();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page3();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page();
            }
        });
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_ad_page1();
            }
        });
    }
    public void openactivity_ad_page2(){
        Intent intent1 = new Intent(this, AdPage2.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page(){
        Intent intent1 = new Intent(this, AdPage.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page3(){
        Intent intent1 = new Intent(this, AdPage3.class);
        startActivity(intent1);
    }
    public void openactivity_ad_page1(){
        Intent intent1 = new Intent(this, AdPage1.class);
        startActivity(intent1);
    }
}
