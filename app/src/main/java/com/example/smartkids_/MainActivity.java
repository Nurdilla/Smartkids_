package com.example.smartkids_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void intentScreen(View view) {
        Intent myIntent = new Intent(this,MainActivity2.class);
        startActivity (myIntent);
    }
}