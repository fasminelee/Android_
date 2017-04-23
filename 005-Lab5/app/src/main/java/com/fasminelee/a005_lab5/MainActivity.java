package com.fasminelee.a005_lab5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launch_intent() {
        Intent intent = new Intent(MainActivity.this, launch_intent.class);
        startActivity(intent);
    }

    public void load_url() {
        Intent intent = new Intent(MainActivity.this, load_url.class);
        startActivity(intent);
    }
}
