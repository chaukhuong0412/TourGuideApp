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

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> list) {
        super(context, 0, list);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_place, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentPlace.getPlaceName());

        TextView addressTextView = listItemView.findViewById(R.id.place_address);
        addressTextView.setText(currentPlace.getPlaceAddress());

        TextView typeTextView = listItemView.findViewById(R.id.place_type);
        String typeText = getContext().getString(R.string.type) + currentPlace.getPlaceType();
        typeTextView.setText(typeText);

        TextView openCloseHourTextView = listItemView.findViewById(R.id.place_open_close_hour);
        String openCloseHourText = getContext().getString(R.string.from) + currentPlace.getOpenHour() + getContext().getString(R.string.h00_to) + currentPlace.getCloseHour() + getContext().getString(R.string.h00);
        openCloseHourTextView.setText(openCloseHourText);

        TextView stateOfPlace = (TextView) listItemView.findViewById(R.id.place_state);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00"));
        Date currentLocalTime = cal.getTime();
        DateFormat date = new SimpleDateFormat("HH");
        date.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        String localTime = date.format(currentLocalTime);
        Integer time = Integer.parseInt(localTime);
        if (time >= currentPlace.getOpenHour() && time < currentPlace.getCloseHour()) {
            stateOfPlace.setText(R.string.state_openning);
            stateOfPlace.setTextColor(Color.GREEN);
        }
        else {
            stateOfPlace.setText(R.string.state_closed);
            stateOfPlace.setTextColor(Color.RED);
        }

        ImageView placeImage = listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getPlaceImageResourceId());

        return listItemView;
    }
}
