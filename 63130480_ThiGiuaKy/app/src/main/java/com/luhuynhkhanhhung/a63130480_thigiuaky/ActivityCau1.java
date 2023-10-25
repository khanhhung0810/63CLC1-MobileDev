package com.luhuynhkhanhhung.a63130480_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityCau1 extends AppCompatActivity  {

    EditText soA, soB;

    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);

        soA = findViewById(R.id.edtSoa);
        soB = findViewById(R.id.edtSob);
        tvKetQua = findViewById(R.id.tvKetQua);

    }




    public void TinhTong(View v){
        EditText texta=findViewById(R.id.edtSoa);
        EditText textb=findViewById(R.id.edtSob);
        TextView textkq=findViewById(R.id.tvKetQua);
        float numbera =Float.parseFloat(String.valueOf(texta.getText())) ;
        float numberb =Float.parseFloat(String.valueOf(textb.getText())) ;
        float ketQua = numbera+numberb;
        textkq.setText(String.valueOf(ketQua));
    }
    public void QuayVe (View v){
        Intent iQuayVe = new Intent(this, MainActivity.class);
        startActivity(iQuayVe);
    }
}