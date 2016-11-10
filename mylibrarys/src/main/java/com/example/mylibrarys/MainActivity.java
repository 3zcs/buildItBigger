package com.example.mylibrarys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String joke ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);
        if (savedInstanceState == null) {
            Intent i = getIntent();
            joke = i.getStringExtra("key");
         //   Toast.makeText(getApplicationContext() , joke , Toast.LENGTH_LONG).show();

        }else
            joke = savedInstanceState.getString("key");

        Toast.makeText(getApplicationContext() , joke , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key" , joke);
    }
}
