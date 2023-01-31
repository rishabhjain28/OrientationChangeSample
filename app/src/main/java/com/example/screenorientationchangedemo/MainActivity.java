package com.example.screenorientationchangedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b;
    static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 0) {
                    Settings.System.putInt(getApplicationContext().getContentResolver(), Settings.System.USER_ROTATION, 0);
                    count = 1;
                } else {
                    Settings.System.putInt(getApplicationContext().getContentResolver(), Settings.System.USER_ROTATION, 1);
                    count = 0;
                }
            }
        });
    }
}