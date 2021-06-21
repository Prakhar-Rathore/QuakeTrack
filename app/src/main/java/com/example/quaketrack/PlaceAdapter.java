package com.example.quaketrack;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        magnitude.setText(""+currentPlace.getmMagnitude());
        TextView location = listItemView.findViewById(R.id.location);
        location.setText(currentPlace.getmLocation());
        TextView date = listItemView.findViewById(R.id.date);
        date.setText(currentPlace.getmDate());
        TextView time = listItemView.findViewById(R.id.time);
        time.setText(currentPlace.getmTime());
        TextView direction = listItemView.findViewById(R.id.direction);
        direction.setText(currentPlace.getmDirection());


        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();
        int magnitudeColor = getMagnitudeColor(Double.parseDouble(currentPlace.getmMagnitude()));
        magnitudeCircle.setColor(magnitudeColor);


        return listItemView;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
