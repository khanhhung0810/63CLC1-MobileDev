package com.khanhhung.xulysukien1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Xử lý nhấn nút OK
    public void XuLyLogin(View v){
        //B1. Lấy dữ liệu từ 2 editText
            //B1.1 Tìm điều khiển cần lấy dữ liệu
        EditText editText_UN = findViewById(R.id.edtUserName);
        // editText_UN là biến đại diện cho edtUserName ở file xml
        EditText editText_PWD = findViewById(R.id.edtPassword);
            //B1.2 Lấy dữ liệu user đã nhập vào các điều khiển trên
        String tenDN = editText_UN.getText().toString();
        String mk = editText_PWD.getText().toString();
        //B2. Xử lý
        String ketQua;
        if (tenDN.equals("63CLC1") && mk.equals("123"))
            ketQua= "OK, login success";
        else
            ketQua= "not OK, login failed";
        //B3: Xuất kết quả
        Toast.makeText(this, ketQua, Toast.LENGTH_LONG).show();
    }
}