package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class success extends AppCompatActivity {
    private Button doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        doneBtn = (Button) findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_home_page();
            }
        });

    }
    public void broswer1(View view){
        Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(fbIntent);


    }
    public void broswer2(View view){
        Intent MIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.messenger.com/"));
        startActivity(MIntent);
    }
    public void broswer3(View view){
        Intent WIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/"));
        startActivity(WIntent);
    }
    public void broswer4(View view){
        Intent IIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/?hl=en"));
        startActivity(IIntent);
    }
    public void openactivity_home_page(){
        Intent intent1 = new Intent(this, homepage.class);
        startActivity(intent1);
    }


}
