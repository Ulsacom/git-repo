package com.ulsa.meningbirinchilistview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CusotmAdapter extends ArrayAdapter {

    private final Activity contex;
    private final String[] name;
    private final Integer[] image;
    public static int s;


    public CusotmAdapter(@NonNull Activity activity, String[] name, Integer[] image) {
        super(activity, R.layout.custom_adapter, name);
        this.image = image;
        this.name = name;
        this.contex = activity;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = contex.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView = inflater.inflate(R.layout.custom_adapter, null, true);
        TextView txtTitle = rowView.findViewById(R.id.tv);
        ImageView imgTitle = rowView.findViewById(R.id.img);
        txtTitle.setText(name[position]);
        imgTitle.setImageResource(image[position]);
        return rowView;
    }
}
