package com.khanhhung.listviewexmaple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> lsNNLT = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        lsNNLT.add("C");
        lsNNLT.add("C++");
        lsNNLT.add("C#");
        lsNNLT.add("Python");
        lsNNLT.add("Java");
        lsNNLT.add("Ruby");
        lsNNLT.add("Android Java");
        lsNNLT.add("Android Kotlin");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                lsNNLT
        );
        listView.setAdapter(arrayAdapter);
        // event click len item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Code xử lý
                // i là vị trí của item được chọn
                // Lấy về giá trị
                    //C1
//                String mucChon = arrayAdapter.getItem(i);
                    //C2
                String mucChon = lsNNLT.get(i).toString();


                String chuoiThongBao = "You selected" + mucChon;
                Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_LONG).show();

            }
        });
    }
    public void getWidget(){
        listView = findViewById(R.id.lvNNLT);
    }
}