package com.example.namachivaya.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.namachivaya.R;

public class FindBook extends AppCompatActivity {

    Button videoconsult;
    Button videoconsult2;
    Button videoconsult3;
    Button videoconsult4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_book);
        // public void executeSameBehaviour(View void){}
        //navigation
        videoconsult=findViewById(R.id.bookvideoconsult);
        videoconsult.setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), SelectTime.class)
                ));

        videoconsult2=findViewById(R.id.bookvideoconsult2);
        videoconsult2.setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), SelectTime.class)
                ));

        videoconsult3=findViewById(R.id.bookvideoconsult3);
        videoconsult3.setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), SelectTime.class)
                ));
        videoconsult4=findViewById(R.id.bookvideoconsult4);
        videoconsult4.setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), SelectTime.class)
                ));
        findViewById(R.id.bookappoinments).setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), PatientDetailsApmnt.class)
                ));
        findViewById(R.id.bookappoinments2).setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), PatientDetailsApmnt.class)
                ));
        findViewById(R.id.bookappoinments3).setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), PatientDetailsApmnt.class)
                ));
        findViewById(R.id.bookappoinments4).setOnClickListener(
                view -> startActivity(new Intent(getApplicationContext(), PatientDetailsApmnt.class)
                ));
        //on pressing back
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}