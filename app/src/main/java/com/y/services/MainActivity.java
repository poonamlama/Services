package com.y.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import service.MyService;

public class MainActivity extends AppCompatActivity {
private Button btnStartService, btnStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartService=findViewById(R.id.btnStartService);
        btnStopService=findViewById(R.id.btnStopService);

        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMyService();
            }
        });

        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMyService();
            }
        });

    }

    private void startMyService(){
        startService(new Intent(this, MyService.class));
    }

    private void stopMyService(){
        stopService(new Intent(this, MyService.class));
    }
}
