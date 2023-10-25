package com.luhuynhkhanhhung.a63130480_thigiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicArrayAdapter extends BaseAdapter {
    List<Music> listDataSource;
    private LayoutInflater inflater;
    private Context context;

    public MusicArrayAdapter(List<Music> listDataSource, Context context) {
        this.listDataSource = listDataSource;
        this.inflater =LayoutInflater.from(context);
        this.context = context;
    }

    class  MusicItemViewHoder {
        ImageView flagView;
        TextView tenbaihatView;
        TextView tencasiView;
        TextView luotngheView;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MusicItemViewHoder itemViewHoder;
        if (view == null)
        {
            view = inflater.inflate(R.layout.music_item_layout, null);
            itemViewHoder = new MusicItemViewHoder();
            itemViewHoder.flagView = view.findViewById(R.id.imageViewFlag);
            itemViewHoder.tenbaihatView = view.findViewById(R.id.textViewTenBaiHat);
            itemViewHoder.tencasiView = view.findViewById(R.id.textViewTenCaSi);
            itemViewHoder.luotngheView = view.findViewById(R.id.textViewSoLuotNghe);
            view.setTag(itemViewHoder);
        }
        else
        {
            itemViewHoder = (MusicItemViewHoder) view.getTag();
        }

        Music music = listDataSource.get(i);
        itemViewHoder.tenbaihatView.setText(music.getTenBaiHat());
        itemViewHoder.tencasiView.setText(music.getTenCaSi());
        itemViewHoder.luotngheView.setText("Số lượt nghe: "+ music.getSoLuotNghe());

        int flagID = getImgIDbyResName(music.getTenCaSi());
        itemViewHoder.flagView.setImageResource(flagID);
        return view;
    }
    public int getImgIDbyResName (String resName){
        String packageName = context.getPackageName();
        int imgID = context.getResources().getIdentifier(resName, "mipmap", packageName);
        return imgID;

    };
}
