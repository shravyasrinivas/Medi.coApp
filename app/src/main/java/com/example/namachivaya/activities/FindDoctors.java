package com.example.namachivaya.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.namachivaya.R;

public class FindDoctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctors);
        //navigation
        findViewById(R.id.lookformore).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), UserDashboard.class)));

        //grid view navigation
        findViewById(R.id.gridview1).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview2).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview3).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview4).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview5).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview6).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview7).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview8).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview9).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview10).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview11).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));
        findViewById(R.id.gridview12).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FindBook.class)));

        //on pressing back
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}