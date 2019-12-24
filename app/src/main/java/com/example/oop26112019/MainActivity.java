package com.example.oop26112019;

import android.widget.Toast;

public class MainActivity extends BaseActivity{
    @Override
    int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    void show() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
