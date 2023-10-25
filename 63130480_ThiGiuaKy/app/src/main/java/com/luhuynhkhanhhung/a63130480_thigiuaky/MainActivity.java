package com.luhuynhkhanhhung.a63130480_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cau1 (View v){
        Intent iCau1 = new Intent(this, ActivityCau1.class);
        startActivity(iCau1);
    }
    public void Cau2 (View v){
        Intent iCau2 = new Intent(this, ActivityCau2.class);
        startActivity(iCau2);
    }
    public void Cau3 (View v){
        Intent iCau3 = new Intent(this, ActivityCau3.class);
        startActivity(iCau3);
    }
    public void Cau4 (View v){
        Intent iCau4 = new Intent(this, ActivityCau4.class);
        startActivity(iCau4);
    }
}