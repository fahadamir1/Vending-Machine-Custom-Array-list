package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class viie extends AppCompatActivity {

    FloatingActionButton addProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viie);
        ListView listView = (ListView) findViewById(R.id.listview12);
        addProduct = (FloatingActionButton) findViewById(R.id.addProduct);
        Intent i = getIntent();
        ArrayList<product> list = i.getParcelableArrayListExtra("prdList");
        Myadapter adapter = new Myadapter(this,list);
        listView.setAdapter(adapter);
        addProduct.setOnClickListener(view -> {
            startActivity(new Intent(this,add_product.class));
        });
    }


}