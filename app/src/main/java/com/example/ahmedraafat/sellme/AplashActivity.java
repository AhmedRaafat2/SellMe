package com.example.ahmedraafat.sellme;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AplashActivity extends AppCompatActivity {
    final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AplashActivity.this,LoginActivity.class);
                AplashActivity.this.startActivity(intent);
                AplashActivity.this.finish();
            }
        },SPLASH_TIME);
    }
}
