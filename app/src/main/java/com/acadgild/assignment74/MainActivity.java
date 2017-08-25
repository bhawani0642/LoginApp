package com.acadgild.assignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText usernameField;
    EditText password;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameField = (EditText) findViewById(R.id.usernameField);
        password=(EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);


    }
            public void ClickHere(View v) {

                String userName= usernameField.getText().toString();
                String password_txt=password.getText().toString();
                if (usernameField.equals("prienc") && password.equals("priencjha")){
                //correcct password
            }else{
                    //password is wrong
                }

                 {

                     Bundle bundle= new Bundle();

                     bundle.putString("usernameField",userName);
                     bundle.putString("password",password_txt);
                     Intent intent = new Intent(MainActivity.this, SecondClass.class);
                     intent.putExtras(bundle);


                     startActivity(intent);

                }

            }

    }

