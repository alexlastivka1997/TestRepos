package com.example.alex.yourmoney;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ALEX on 15.02.2017.
 */

public class NameActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etName;
    EditText etLastName;
    Button btnSave;
    Button btnCancel;

    SharedPreferences sPref;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);

        etName = (EditText) findViewById(R.id.et_Fname);
        etLastName = (EditText)findViewById(R.id.et_Lname);

        btnSave = (Button)findViewById(R.id.btn_name_save);
        btnCancel = (Button)findViewById(R.id.btn_name_cancel);

        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.btn_name_save:
                saveText();
                finish();
            break;
            case R.id.btn_name_cancel:
                finish();
            break;

        }

    }

    void saveText(){

        String firstName = etName.getText().toString();
        String lastName = etLastName.getText().toString();

        SharedPreferences preferences = getSharedPreferences("name",MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("firstName",firstName);
        editor.putString("lastName",lastName);

        editor.commit();

    }

}
