package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    Button Register;
    EditText user_name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initcomponents();
        settinguplistner();

    }

    private void settinguplistner() {
        Register.setOnClickListener(view -> {
            String username=user_name.getText().toString();
            String password=pass.getText().toString();
            SharedPreferences pref=getSharedPreferences("Registration",MODE_PRIVATE);
            SharedPreferences.Editor editor=pref.edit();
            editor.putString("UserName",username);
            editor.putString("password",password);
            editor.apply();
            startActivity(new Intent(Signup.this,login.class));
        });
    }

    private void initcomponents() {
        Register=findViewById(R.id.Reg_Acti);
        user_name=findViewById(R.id.username);
        pass=findViewById(R.id.password);
    }
}