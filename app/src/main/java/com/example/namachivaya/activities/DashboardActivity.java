package com.example.namachivaya.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namachivaya.R;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class DashboardActivity extends AppCompatActivity {
EditText secretcode;
Button sharebtn,joinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        secretcode=findViewById(R.id.codeBox);
        sharebtn=findViewById(R.id.shareBtn);
        joinbtn=findViewById(R.id.joinBtn);
        URL serverURL;
            try {
                serverURL=new URL("https://meet.jit.si");
                JitsiMeetConferenceOptions jitsiMeetConferenceOptions=
                        new JitsiMeetConferenceOptions.Builder()
                                .setServerURL(serverURL)
                                .setWelcomePageEnabled(false)
                                .build();
                JitsiMeet.setDefaultConferenceOptions(jitsiMeetConferenceOptions);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        joinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JitsiMeetConferenceOptions options=
                        new JitsiMeetConferenceOptions.Builder()
                                .setRoom(secretcode.getText().toString())
                                .setWelcomePageEnabled(false)
                                .build();
                JitsiMeetActivity.launch(DashboardActivity.this,options);
            }
        });
    }
}