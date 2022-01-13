package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class buy_page extends AppCompatActivity {
    private Button viewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_page);

        viewBtn = (Button) findViewById(R.id.viewBtn);
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_search_screen();
            }
        });

        Spinner sp1 = (Spinner) findViewById(R.id.makeSpin);


        Button btn4 = (Button) findViewById(R.id.backBtn);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(buy_page.this, homepage.class));

            }


        });

        String[] arraySpinner = new String[] {
                "Audi", "BMW", "Kia", "Mercedes-Benz", "Nissan", "Suzuki", "Tesla"
        };
        Spinner s = (Spinner) findViewById(R.id.makeSpin);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        String[] arraySpinner1 = new String[] {
                "Model Example", "Model Example", "Model Example"
        };
        Spinner s1 = (Spinner) findViewById(R.id.modelSpin);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);
    }
    public void openactivity_search_screen(){
        Intent intent1 = new Intent(this, SearchScreen.class);
        startActivity(intent1);
    }
    }


