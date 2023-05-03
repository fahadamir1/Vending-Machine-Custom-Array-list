package com.example.vending_machine;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class product implements Parcelable {
    int imageid;
    String title;
    String Description;
    String quantity;
    String price;
public product(){
    super();
}
    public product(int imageid, String title, String description, String quantity, String price) {
        this.imageid = imageid;
        this.title = title;
        Description = description;
        this.quantity = quantity;
        this.price = price;
    }


    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    protected product(Parcel in) {
        imageid = in.readInt();
        title = in.readString();
        Description = in.readString();
        quantity = in.readString();
        price = in.readString();
    }

    public static final Creator<product> CREATOR = new Creator<product>() {
        @Override
        public product createFromParcel(Parcel in) {
            return new product(in);
        }

        @Override
        public product[] newArray(int size) {
            return new product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(imageid);
        parcel.writeString(title);
        parcel.writeString(Description);
        parcel.writeString(quantity);
        parcel.writeString(price);
    }
}
