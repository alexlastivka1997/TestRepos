package com.example.alex.yourmoney;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonName;
    Button buttonDate;
    Button buttonAbout;
    Button buttonRegistration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonName = (Button)findViewById(R.id.button_name);
        buttonDate = (Button)findViewById(R.id.button_date);
        buttonAbout = (Button)findViewById(R.id.button_about);
        buttonRegistration = (Button)findViewById(R.id.button_registration);

        buttonName.setOnClickListener(this);
        buttonDate.setOnClickListener(this);
        buttonAbout.setOnClickListener(this);
        buttonRegistration.setOnClickListener(this);
    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.button_name:
                Intent nameIntent = new Intent(this, NameActivity.class);
                startActivity(nameIntent);
            break;
            case R.id.button_date:
                Intent dateIntent = new Intent(this, DateActivity.class);
                startActivity(dateIntent);
            break;
            case R.id.button_about:
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
            break;
            case R.id.button_registration:
                Intent registrationIntent = new Intent(this, LastActivity.class);
                startActivity(registrationIntent);
            break;

        }

    }
}
