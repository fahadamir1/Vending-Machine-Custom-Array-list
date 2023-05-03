package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ManuActivity2 extends AppCompatActivity {
    private Button signup,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);
        intcomponent();
        settinguplistners();
        settinguplistners1();
    }

    public void settinguplistners() {
        signup.setOnClickListener(view -> {
            startActivity(new Intent(ManuActivity2.this,Signup.class));
        });
    }
    public void settinguplistners1() {
        login.setOnClickListener(view -> {
            startActivity(new Intent(ManuActivity2.this,login.class));
        });
    }

    private void intcomponent() {
        signup=findViewById(R.id.Signup);
        login=findViewById(R.id.login);

    }
}