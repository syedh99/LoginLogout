package com.example.loginlogout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        register = (TextView) findViewById(R.id.registerButton) ;
        register.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        TextView username = (TextView) findViewById(R.id.username);
//        TextView password = (TextView) findViewById(R.id.password);
//
//        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginButton);

        //admin and admin

    }

    @Override
    public void onClick(View v)
    {
//        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
//        {
//            Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
//        } else
//        {
//            Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
//        }

        switch (v.getId())
        {
            case R.id.registerButton:
                startActivity(new Intent(this, RegisterUser.class));
        }
     }
}