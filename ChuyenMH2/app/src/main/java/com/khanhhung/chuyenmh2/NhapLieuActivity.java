package com.khanhhung.chuyenmh2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhapLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("DataExchangeIntent");
    }

    public void Nhap_QuayVe (View v){

        EditText edHT = (EditText)findViewById(R.id.edtHoVaTen);
        EditText edNS = (EditText)findViewById(R.id.edtTuoi);
        String hoTen = edHT.getText().toString();
        int namSinh = Integer.parseInt(edNS.getText().toString());
        Intent iKQnhapLieu = new Intent();
        iKQnhapLieu.putExtra("HT", hoTen);
        iKQnhapLieu.putExtra("NS", namSinh);
        setResult(RESULT_OK, iKQnhapLieu);
        finish();
    }

    public void MacDinh (View v){
        Intent iQuayVe = new Intent(this, MainActivity.class);
        startActivity(iQuayVe);
    }
}