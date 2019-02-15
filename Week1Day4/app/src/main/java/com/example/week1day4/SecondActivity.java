package com.example.week1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView firstName;
    TextView lastName;
    TextView address;
    TextView city;
    TextView state;
    TextView zipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        zipcode = findViewById(R.id.zipcode);

        if (intent !=  null){
            firstName.setText(intent.getStringExtra(MainActivity.FIRST_NAME));
            lastName.setText(intent.getStringExtra(MainActivity.LAST_NAME));
            address.setText(intent.getStringExtra(MainActivity.ADDRESS));
            city.setText(intent.getStringExtra(MainActivity.CITY));
            state.setText(intent.getStringExtra(MainActivity.STATE));
            zipcode.setText(intent.getStringExtra(MainActivity.ZIP_CODE));
        }
    }
}
