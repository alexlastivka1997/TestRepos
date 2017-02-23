package com.example.alex.yourmoney;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ALEX on 19.02.2017.
 */

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etAbout;

    Button btnSave;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        etAbout = (EditText) findViewById(R.id.et_about);

        btnSave = (Button)findViewById(R.id.btn_about_save);
        btnCancel = (Button)findViewById(R.id.btn_about_cancel);

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.btn_about_save:
                saveAbout();
                finish();
                break;
            case R.id.btn_about_cancel:
                finish();
                break;

        }

    }

    void saveAbout(){

        String about = etAbout.getText().toString();

        SharedPreferences preference = getSharedPreferences("about",MODE_PRIVATE);

        SharedPreferences.Editor editor = preference.edit();

        editor.putString("about", about);
        editor.commit();

    }
}
