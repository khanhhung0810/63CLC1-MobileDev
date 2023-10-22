package com.khanhhung.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        dsQG = new ArrayList<Country>();
        Country qg1 = new Country("ThuySy", "st",10000000);
        Country qg2 = new Country("Canada", "cd",10000000);
        Country qg3 = new Country("Chile", "cl",10000000);
        dsQG.add(qg1);
        dsQG.add(qg2);
        dsQG.add(qg3);
        // tim dieu khien
        ListView lvQG = findViewById(R.id.listViewNation);
        //Tao adapter
        CountryArrayAdapter adapter;
        adapter = new CountryArrayAdapter(dsQG, this);
        //Gan vao
        lvQG.setAdapter(adapter);
        //xu ly su kien

    }
}