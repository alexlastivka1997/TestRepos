package com.example.alex.yourmoney;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ALEX on 19.02.2017.
 */

public class LastActivity extends AppCompatActivity implements View.OnClickListener {


    TextView txtName;
    TextView txtLastName;
    TextView txtDate;
    TextView txtAbout;

    Button btnClose;

    SharedPreferences sPref;

    String saved_text = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last);

        btnClose = (Button)findViewById(R.id.btn_closeAPP);

        txtName = (TextView)findViewById(R.id.txt_name);
        txtLastName = (TextView)findViewById(R.id.txt_lastname);
        txtDate = (TextView)findViewById(R.id.txt_date);
        txtAbout = (TextView)findViewById(R.id.txt_about);

        SharedPreferences preferences = getSharedPreferences("name",MODE_PRIVATE);

        String firstName = preferences.getString("firstName","").toString();
        String lastName = preferences.getString("lastName","").toString();

        SharedPreferences preferences1 = getSharedPreferences("date",MODE_PRIVATE);

        String date = preferences1.getString("date","").toString();

        SharedPreferences preferences2 = getSharedPreferences("about",MODE_PRIVATE);

        String about = preferences2.getString("about","").toString();

        txtName.setText(firstName);
        txtLastName.setText(lastName);
        txtDate.setText(date);
        txtAbout.setText(about);

        btnClose.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){

            case R.id.btn_closeAPP:
                finishAffinity();
            break;

        }
    }

}