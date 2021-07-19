package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mtvEmail;
    private EditText mtvPassword;
    private CheckBox mRememberMe;
    private Button mbtnLogin;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isEmailValid() && isPasswordValid() ){
                    Intent intent = new Intent(MainActivity.this,HomeScreenActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initViews() {
        mtvEmail = findViewById(R.id.tvEmail);
        mtvPassword=findViewById(R.id.tvPassword);
        mRememberMe = findViewById(R.id.rememberMe);
        mbtnLogin =findViewById(R.id.btnLogin);
    }
    private boolean isEmailValid(){
        if (mtvEmail.getText().toString().matches(emailValidation)){
            return true;
        }else {
            mtvEmail.setError("InValid Email");
            return false;
        }
    }
    private boolean isPasswordValid(){
        if (mtvPassword.getText().toString().length()>=6){
            return true;
        }
        else {
            mtvPassword.setError("Password is very short");
            return false;
        }
    }

}