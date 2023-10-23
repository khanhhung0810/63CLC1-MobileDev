package com.khanhhung.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryArrayAdapter extends BaseAdapter {
    // Nguồn dữ liệu
    List<Country> listDataSource;
    private LayoutInflater inflater;
    private  Context context;
    //Constructor
    public CountryArrayAdapter(List<Country> listDataSource, Context context) {
        this.listDataSource = listDataSource;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }
    //inner class
    class  CountryItemViewHoder { //mapping from customize item XML layout
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }



    @Override
    public int getCount() {
        return listDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return listDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CountryItemViewHoder itemViewHoder;
        if (view == null)
        {
            //XML --> Java item
            view = inflater.inflate(R.layout.country_item_layout, null);
            //get ref: Java -- XML
            itemViewHoder = new CountryItemViewHoder();
            itemViewHoder.flagView = view.findViewById(R.id.imageViewFlag);
            itemViewHoder.countryNameView = view.findViewById(R.id.textViewCountryName);
            itemViewHoder.populationView = view.findViewById(R.id.textViewPopulation);
            //
            view.setTag(itemViewHoder);
        }
        else
        {
            itemViewHoder = (CountryItemViewHoder)view.getTag();
        }
        // Set data's item
        Country countryItem = listDataSource.get(i);
        itemViewHoder.countryNameView.setText(countryItem.getCountryName());
        itemViewHoder.populationView.setText("Population: "+ countryItem.getPopulation());
            //image data
        int flagID = getImgIDbyResName(countryItem.getCountryFlag());
        itemViewHoder.flagView.setImageResource(flagID);
        return view;
    }
    public int getImgIDbyResName (String resName){
        String packageName = context.getPackageName();
        int imgID = context.getResources().getIdentifier(resName, "mipmap", packageName);
        return imgID;

    };
}
