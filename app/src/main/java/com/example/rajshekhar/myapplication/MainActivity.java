package com.example.rajshekhar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mylibrary.LogDebugger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Log","sample log");

        String logDebug = LogDebugger.logDebug();

       String logError = LogDebugger.logError();

       String logInfo = LogDebugger.logInfo();




    }
}
