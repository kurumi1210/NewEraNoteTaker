package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText EditUsername,EditPassword;
    private Button btnLogin;
    private String username="xh1210",password="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setLister();
    }

    private void findViews(){

        EditUsername = findViewById(R.id.edit_username);
        EditPassword = findViewById(R.id.edit_password);
        btnLogin = findViewById(R.id.btn_login);
    }

    private void setLister(){
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String inputUsername= EditUsername.getText().toString();
                String inputPassword= EditPassword.getText().toString();

                if (inputUsername.equals(username) && inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this,"Login Succesfully",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, com.example.neweranotetaker.HomeActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"Login Fail",Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
