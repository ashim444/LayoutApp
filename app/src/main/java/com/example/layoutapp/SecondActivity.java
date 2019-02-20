package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar secondToolBar = findViewById(R.id.second_toolbar);
        //TODO find solution for setSupportActionBar and make it default action bar
        setSupportActionBar(secondToolBar);
    }
}
