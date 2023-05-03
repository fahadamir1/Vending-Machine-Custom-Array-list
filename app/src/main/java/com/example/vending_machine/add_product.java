package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.os.Parcelable;
import java.util.ArrayList;
import android.content.Intent;
public class add_product extends AppCompatActivity {
    EditText title,description,price,quantity;
    ImageView imageid;
    Button addbutton;
    ArrayList<product> Product;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        initComponents();
        Product = new ArrayList<>();
        settingUpListners();
    }

    private void settingUpListners() {
        addbutton.setOnClickListener(view -> {
            product p = new product();
            p.setTitle(title.getText().toString());
            p.setDescription(description.getText().toString());
            p.setQuantity((quantity.getText().toString()));
            p.setPrice((price.getText().toString()));
            p.setImageid(imageid.getId());
            Product.add(p);
            Intent i = new Intent(add_product.this, viie.class);
            i.putExtra("prdList",Product);
            startActivity(i);

        });
    }

    private void initComponents() {
        title = findViewById(R.id.prdtitle);
        quantity  = findViewById(R.id.prdquantity);
        price  = findViewById(R.id.prdprice);
        imageid = findViewById(R.id.prdimg);
        addbutton = findViewById(R.id.add);
        description=findViewById(R.id.prddescriptoin);
    }
}