package com.example.biolink.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.biolink.R;

public class PreStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_start);
        Handler mainLooperHandler = new Handler(Looper.getMainLooper());

        mainLooperHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(PreStartActivity.this, StartActivity.class);
                startActivity(intent);
                }

        }, 2000);
}
}


