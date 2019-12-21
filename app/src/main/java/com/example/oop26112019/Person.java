package com.example.oop26112019;


import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Person {

    // 1 : Thuoc tinh
    private String name;
    private Integer age;

    // 2 : Constructor param

    // alt + insert
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
