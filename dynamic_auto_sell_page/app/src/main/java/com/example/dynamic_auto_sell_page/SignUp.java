package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_home_page();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_Log();
            }
        });

    }

    public void openactivity_home_page(){
        Intent intent1 = new Intent(this, homepage.class);
        startActivity(intent1);
    }

    public void openactivity_Log(){
        Intent intent1 = new Intent(this, LogIn.class);
        startActivity(intent1);
    }
}
