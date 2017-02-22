package com.example.alex.yourmoney;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ALEX on 19.02.2017.
 */

public class DateActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSave;
    Button btnCancel;
    EditText etDate;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        btnSave = (Button)findViewById(R.id.btn_date_save);
        btnCancel = (Button)findViewById(R.id.btn_date_cancel);
        etDate = (EditText)findViewById(R.id.et_date);

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.btn_date_save:
                saveDate();
                Intent intent1 = new Intent(this,MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_date_cancel:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

        }

    }

    void saveDate(){

        String Date = etDate.getText().toString();

        SharedPreferences preferences = getSharedPreferences("date",MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("date",Date);

        editor.commit();

    }
}
