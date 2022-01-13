package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    private Button aboutBtn;
    private Button accountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button btn1 = (Button) findViewById(R.id.sellBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, MainActivity.class));

            }
        });

        Button btn3 = (Button) findViewById(R.id.buyBtn);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, buy_page.class));
            }
        });
        aboutBtn = (Button) findViewById(R.id.aboutBtn);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_about_screen();
            }
        });

        accountBtn = (Button) findViewById(R.id.accountBtn);
        accountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_account_screen();
            }
        });
    }

    public void openactivity_about_screen(){
        Intent intent1 = new Intent(this, AboutScreen.class);
        startActivity(intent1);
    }

    public void openactivity_account_screen(){
        Intent intent1 = new Intent(this, AccountScreen.class);
        startActivity(intent1);
    }
}
