package com.example.vending_machine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Myadapter extends BaseAdapter {

    private Context context;
    private ArrayList<product> myList;
    private LayoutInflater inflater;

    public Myadapter(Context c,ArrayList<product> list){
    context=c;
    myList=list;
    inflater = LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int i) {
        return myList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

            view = inflater.inflate(R.layout.my_layout,viewGroup,false);
        ImageView p_img = view.findViewById(R.id.listimage);
        TextView p_title = view.findViewById(R.id.title);
        TextView description=view.findViewById(R.id.description);
        TextView p_quantity = view.findViewById(R.id.quantity);
        TextView p_price = view.findViewById(R.id.price);
        p_img.setImageResource(R.drawable.ic_launcher_background);
        p_title.setText(myList.get(i).getTitle());
        description.setText(myList.get(i).getDescription());
        p_quantity.setText(myList.get(i).getQuantity().toString());
        p_price.setText(myList.get(i).getPrice().toString());
        return view;
    }
}
