package com.acadgild.assignment74;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pri on 7/13/2017.
 */

public class SecondClass extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        String message;


        Intent intent = getIntent();
        Bundle bundle= intent.getExtras();
        String fName = getIntent().getStringExtra("usernameField");
        String Password = intent.getStringExtra("password");
        message="Welcome you are sucessfully logged in "+fName;
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();



        }
    }

