package com.luhuynhkhanhhung.a63130480_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityCau3 extends AppCompatActivity {
    ArrayList<Music> dsBH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);
        dsBH = new ArrayList<Music>();
        Music bh1 = new Music("Vầng Trăng Cô Đơn","Ca sĩ: Tuấn Hưng","th",12000000);
        Music bh2 = new Music("Sầu Thiên Thu","Ca sĩ: Lâm Chí Khanh","kc",12000000);
        Music bh3 = new Music("Như Là Tình Yêu","Ca sĩ: MTV","mtv",12000000);
        dsBH.add(bh1);
        dsBH.add(bh2);
        dsBH.add(bh3);

        ListView lvBH = findViewById(R.id.listViewMusic);

        MusicArrayAdapter adapter;
        adapter = new MusicArrayAdapter (dsBH, this);
        //Gan vao
        lvBH.setAdapter(adapter);
    }
}