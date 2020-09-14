package com.example.broadcastreceiver13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver(
                new MyBroadcast(),
                new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        );
    }
}