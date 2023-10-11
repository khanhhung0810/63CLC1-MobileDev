package com.khanhhung.autocompleteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auTV;
    //b1
    ArrayList<String> countries = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b0
        getWidget();
        //b1 tiếp, đưa DL vào list
        countries.add("VietNam");
        countries.add("Australia");
        countries.add("England");
        countries.add("Albania");
        countries.add("USA");
        countries.add("Algeria");
        //b2
        ArrayAdapter<String> arrayCountries = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line, //bố cục hiển thị
                countries //nguồn DL để hiển thị
        );
        //b3
        auTV.setAdapter(arrayCountries);
    }
    public void getWidget(){
        auTV = findViewById(R.id.autoCompleteCountries);
    }
}