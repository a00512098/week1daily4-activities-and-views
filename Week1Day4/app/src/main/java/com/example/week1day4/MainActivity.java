package com.example.week1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    public final static String FIRST_NAME = "FIRST NAME";
    public final static String LAST_NAME = "LAST NAME";
    public final static String ADDRESS = "ADDRESS";
    public final static String CITY = "CITY";
    public final static String STATE = "STATE";
    public final static String ZIP_CODE= "ZIP CODE";

    EditText firstNameEt;
    EditText lastNameEt;
    EditText addressEt;
    EditText cityEt;
    EditText stateEt;
    EditText zipCodeEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEt = findViewById(R.id.firstNameEt);
        lastNameEt = findViewById(R.id.lastNameEt);
        addressEt = findViewById(R.id.addressEt);
        cityEt = findViewById(R.id.cityEt);
        stateEt = findViewById(R.id.stateEt);
        zipCodeEt = findViewById(R.id.zipEt);
    }

    public void changeActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        // sorry for this
        intent.putExtra(FIRST_NAME, firstNameEt.getText() != null ? firstNameEt.getText().toString() : "");
        intent.putExtra(LAST_NAME, lastNameEt.getText() != null ? lastNameEt.getText().toString() : "");
        intent.putExtra(ADDRESS, addressEt.getText() != null ? addressEt.getText().toString() : "");
        intent.putExtra(CITY, cityEt.getText() != null ? cityEt.getText().toString() : "");
        intent.putExtra(STATE, stateEt.getText() != null ? stateEt.getText().toString() : "");
        intent.putExtra(ZIP_CODE, zipCodeEt.getText() != null ? zipCodeEt.getText().toString() : "");
        startActivity(intent);
    }
}
