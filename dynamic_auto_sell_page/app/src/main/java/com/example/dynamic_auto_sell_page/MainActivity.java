package com.example.dynamic_auto_sell_page;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextSelection;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private Button button;

    EditText make, model, reg, colour, year, transmission, fuel, engineSize, carDesc, price;
    String str_make, str_model, str_reg, str_colour, str_year, str_transmission, str_fuel, str_engSize, str_carDesc, str_price;
    //    RequestQueue requestQueue;
    String showVehiclesURL = "https://selene.hud.ac.uk/u1860926/vehicles_listed.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make = (EditText) findViewById(R.id.makeTxt);
        model = (EditText) findViewById(R.id.modelTxt);
        reg = (EditText) findViewById(R.id.regTxt);
        colour = (EditText) findViewById(R.id.colourTxt);
        year = (EditText) findViewById(R.id.yearTxt);
//        transmission = (EditText) findViewById(R.id.gearboxTxt);
//        fuel = (EditText) findViewById(R.id.fuelTxt);
        engineSize = (EditText) findViewById(R.id.engSizeTxt);
        carDesc = (EditText) findViewById(R.id.descTxt);
        price = (EditText) findViewById(R.id.priceTxt);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validationSuccess();
            }
        });

        String[] arraySpinner = new String[]{
                "---", "Automatic", "Manual", "Semi-Automatic"
        };
        Spinner s = (Spinner) findViewById(R.id.transSpin);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        String[] arraySpinner1 = new String[]{
                "---", "Petrol", "Diesel", "Hybrid"
        };
        Spinner s1 = (Spinner) findViewById(R.id.fuelSpin);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter1);

//        if(s.getSelectedItemPosition()==0){
//            Toast.makeText(getApplicationContext(), "ERROR: Please choose a valid transmission type.", Toast.LENGTH_SHORT).show();
//        }


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(MainActivity.this, success.class));
//            }
//        });
    }

    private boolean validationSuccess() {
        if (reg.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter registration number to your vehicle", Toast.LENGTH_SHORT).show();
        return false;
        }
        if (make.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter a valid Vehicle Manufacturer", Toast.LENGTH_SHORT).show();
        return false;
        }
        if (model.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter a valid vehicle model", Toast.LENGTH_SHORT).show();
            return false;

        }
        if (colour.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter the colour", Toast.LENGTH_SHORT).show();
            return false;

        }
        if (year.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter the year your vehicle was registered.", Toast.LENGTH_SHORT).show();
            return false;

        }
//        if (transmission.getText().toString().equalsIgnoreCase("")) {
//            Toast.makeText(getApplicationContext(), "ERROR: Please enter a valid transmission type", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if (fuel.getText().toString().equalsIgnoreCase("")) {
//            Toast.makeText(getApplicationContext(), "ERROR: Please enter a valid fuel type", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        if (engineSize.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter the engine size of your vehicle", Toast.LENGTH_SHORT).show();
            return false;

        }
        if (carDesc.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please provide a short description of your vehicle", Toast.LENGTH_SHORT).show();
            return false;

        }
        if (price.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "ERROR: Please enter the price of the vehicle", Toast.LENGTH_SHORT).show();
            return false;

        }
        if (true){
            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openactivity_success();
                }
            });
        }

        return true;

    }
    public void openactivity_success(){
        Intent intent1 = new Intent(this, success.class);
        startActivity(intent1);
    }








            public void onSubmit(View view) {

                String str_make = make.getText().toString();
                String str_model = model.getText().toString();
                String str_reg = reg.getText().toString();
                String str_colour = colour.getText().toString();
                String str_year = year.getText().toString();
                String str_transmission = transmission.getText().toString();
                String str_fuel = fuel.getText().toString();
                String str_engSize = engineSize.getText().toString();
                String str_carDesc = carDesc.getText().toString();
                String str_price = price.getText().toString();
                String type = "submit";


//        EditText vehicleMake = (EditText)findViewById(R.id.makeTxt);
//        if( vehicleMake.getText().toString().length() == 0 )
//            vehicleMake.setError( "Please enter a valid vehicle manufacturer" );


//        BackgroundWorker backgroundWorker = new BackgroundWorker (this);
//        backgroundWorker.execute(type,str_make,str_model,str_reg,str_colour,str_year,str_transmission,str_fuel,
//        str_engSize,str_carDesc,str_price);

                // https://www.youtube.com/watch?v=age2l7Rrwtc continue at 18:59


            }


}

