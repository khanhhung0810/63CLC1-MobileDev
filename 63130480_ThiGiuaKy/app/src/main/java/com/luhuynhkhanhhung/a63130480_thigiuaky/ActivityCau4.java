package com.luhuynhkhanhhung.a63130480_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityCau4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau4);
    }

    public void QuayVe(View v) {
        Intent iQuayVe = new Intent(this, MainActivity.class);
        startActivity(iQuayVe);
    }
}