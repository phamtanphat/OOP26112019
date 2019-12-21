package com.example.oop26112019;


import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Person {

    // 1 : Thuoc tinh
    private String name;
    private Integer age;

    // 2 : Constructor param
    public Person(String name , Integer age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        if (name.length() <= 0){
            Log.d("BBB","Khong day du thong tin");
            return;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
