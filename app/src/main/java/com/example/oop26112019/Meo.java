package com.example.oop26112019;

import android.util.Log;

public class Meo extends Animal {
    String address;
    // 5 : solid

    public Meo(String name , String color , String address){
        super(name,color);
        this.address = address;
    }

    @Override
    public void setLanguage(String language) {
        Log.d("BBB","Intance Meo");
        super.setLanguage(language);
    }
}
