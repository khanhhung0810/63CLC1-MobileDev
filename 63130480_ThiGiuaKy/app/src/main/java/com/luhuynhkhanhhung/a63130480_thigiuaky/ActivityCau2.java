package com.luhuynhkhanhhung.a63130480_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityCau2 extends AppCompatActivity {
    ListView listView;
    ArrayList<String> lsDSBH = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);
        getWidget();
        lsDSBH.add("Người Đàn Ông Chân Thật - Trần Tâm");
        lsDSBH.add("Tôi Đã Lầm Tin Em - Lý Hải");
        lsDSBH.add("Vầng Trăng Cô Đơn - Tuấn Hưng");
        lsDSBH.add("Chiếc Lá Mùa Đông - Nguyễn Hưng");
        lsDSBH.add("Tình Yêu Mang Theo - Nhật Tinh Anh");
        lsDSBH.add("Không Yêu Thì Thôi - Lý Hải");
        lsDSBH.add("Sầu Thiên Thu - Lâm Chí Khanh");
        lsDSBH.add("Như Là Tình Yêu - MTV");
        lsDSBH.add("Thà Rằng Như Thế - Ưng Hoàng Phúc");
        lsDSBH.add("Trống Vắng - Phương Thanh");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                lsDSBH
        );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String mucChon = lsDSBH.get(i).toString();


                String chuoiThongBao = "Bạn đã chọn " + mucChon;
                Toast.makeText(ActivityCau2.this, chuoiThongBao, Toast.LENGTH_LONG).show();

            }
        });
    }

    public void QuayVe (View v){
        Intent iQuayVe = new Intent(this, MainActivity.class);
        startActivity(iQuayVe);

    }
    public void getWidget(){
        listView = findViewById(R.id.lvDSBH);
    }
}