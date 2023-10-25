package com.khanhhung.chuyenmh2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NhapLieu (View v){
        Intent iNhap = new Intent(MainActivity.this, NhapLieuActivity.class);
        startActivityForResult(iNhap, 8000);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        if (requestCode == 8000)
            if (resultCode == RESULT_OK)
            {
                String hoTenNhanDuoc = data.getStringExtra("HT");
                int namSinhNhanDuoc = data.getIntExtra("NS", 2003);
                TextView tvHT = (TextView) findViewById(R.id.tvHoTen);
                TextView tvNS = (TextView) findViewById(R.id.tvTuoi);
                tvHT.setText(hoTenNhanDuoc);
                tvNS.setText(String.valueOf(namSinhNhanDuoc));
            }
        else
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_LONG);
        else
            super.onActivityResult(requestCode, resultCode, data);
    }
}