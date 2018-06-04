package com.example.android.tourguideapp;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by User on 4/30/2018.
 */

public class TripAdapter extends ArrayAdapter<Trip> {

    public TripAdapter(Activity context, ArrayList<Trip> list) {
        super(context, 0, list);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_trip, parent, false);
        }

        Trip currentTrip = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.trip_name);
        nameTextView.setText(currentTrip.getTripName());

        TextView durationTextView = listItemView.findViewById(R.id.trip_duration);
        String durationText = getContext().getString(R.string.duration) + currentTrip.getTripDuration() + getContext().getString(R.string.day);
        durationTextView.setText(durationText);

        TextView costTextView = listItemView.findViewById(R.id.trip_cost);
        String costText = getContext().getString(R.string.cost) + currentTrip.getTripCost() + getContext().getString(R.string.usd);
        costTextView.setText(costText);

        ImageView tripImage = listItemView.findViewById(R.id.trip_image);
        tripImage.setImageResource(currentTrip.getTripImageSourceId());

        return listItemView;
    }
}
