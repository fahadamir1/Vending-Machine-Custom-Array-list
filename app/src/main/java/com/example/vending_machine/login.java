package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText getusername,getpass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initcomponents();
        settinguplistner();
    }

    public void settinguplistner() {
        login.setOnClickListener(view -> {
            String act_usename=getusername.getText().toString();
            String act_pass=getpass.getText().toString();
            SharedPreferences pref=getSharedPreferences("Registration",MODE_PRIVATE);
            String check_user=pref.getString("UserName"," ");
            String check_pass=pref.getString("password"," ");
            if(act_usename.equals(check_user)&&act_pass.equals(check_pass)){
                Toast.makeText(this,"Login Successfulluy",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),add_product.class));
            }
            else{
                Toast.makeText(this,"Login Un-Successful TryAgain",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void initcomponents() {
        login=findViewById(R.id.login_Acti);
    getusername=findViewById(R.id.username);
    getpass=findViewById(R.id.password);

    }
}