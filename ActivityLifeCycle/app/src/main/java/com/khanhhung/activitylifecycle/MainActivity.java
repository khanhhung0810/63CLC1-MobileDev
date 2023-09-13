package com.khanhhung.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle Step";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        Log.d(tag, "Khởi tạo biến ở đây");

    }


}