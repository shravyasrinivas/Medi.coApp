package com.example.namachivaya.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.namachivaya.R;
public class PatientDetailsApmnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details_apmnt);
        findViewById(R.id.submit).setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), UserDashboard.class)
                ));
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}