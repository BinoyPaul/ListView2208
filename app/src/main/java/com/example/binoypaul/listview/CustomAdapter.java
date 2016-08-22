package com.example.binoypaul.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by binoy.paul on 6/22/2016.
 */
class CustomAdapter extends ArrayAdapter<String> {

    //Press Alt + Insert
    public CustomAdapter(Context context, String[] food) {
        super(context, R.layout.customrow,food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckyInflater = LayoutInflater.from(getContext());
        View customView = buckyInflater.inflate(R.layout.customrow , parent, false);
        // buckyInflater.inflate(int resource, ViewGroup Root, boolean AttackToRoot)

        String foodItem = getItem(position);
        TextView BinoText = (TextView) customView.findViewById(R.id.BinoText);
        ImageView BinoImg = (ImageView) customView.findViewById(R.id.BinoImg);
        BinoText.setText(foodItem);
        //BinoImg.setImageResource(R.drawable.img2);
        return customView;
    }
}
