package com.example.oop26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Class

        // object
        Person teo = new Person("Nguyen Van Teo",15);


        Person ti = new Person("Nguyen Van Ti",10);

        //access modifier
    }
}
