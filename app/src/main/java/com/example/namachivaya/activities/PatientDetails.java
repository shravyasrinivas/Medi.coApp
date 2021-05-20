package com.example.namachivaya.activities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.namachivaya.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientDetails extends AppCompatActivity {
    Button bookbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);
        //on pressing back
        bookbtn=findViewById(R.id.video_call);
        //on pressing back
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        bookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientDetails.this,DashboardActivity.class));
            }
        });
    }
}