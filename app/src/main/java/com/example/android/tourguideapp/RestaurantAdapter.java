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
import java.util.Calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by User on 4/29/2018.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantAdapter(Activity context, ArrayList<Restaurant> list) {
        super(context, 0, list);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_restaurant, parent, false);
        }

        Restaurant currentRestaurant = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.restaurant_name);
        nameTextView.setText(currentRestaurant.getRestaurantName());

        TextView addressTextView = listItemView.findViewById(R.id.restaurant_address);
        addressTextView.setText(currentRestaurant.getRestaurantAddress());

        TextView openCloseHourTextView = listItemView.findViewById(R.id.retaurant_open_close_hour);
        String openCloseHourText = getContext().getString(R.string.from) + currentRestaurant.getOpenHour() + getContext().getString(R.string.h00_to) + currentRestaurant.getCloseHour() + getContext().getString(R.string.h00);
        openCloseHourTextView.setText(openCloseHourText);

        TextView stateOfRestaurant = listItemView.findViewById(R.id.restaurant_state);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00"));
        Date currentLocalTime = cal.getTime();
        DateFormat date = new SimpleDateFormat("HH");
        date.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        String localTime = date.format(currentLocalTime);
        Integer time = Integer.parseInt(localTime);
        if (time >= currentRestaurant.getOpenHour() && time < currentRestaurant.getCloseHour()) {
            stateOfRestaurant.setText(R.string.state_openning);
            stateOfRestaurant.setTextColor(Color.GREEN);
        }
        else {
            stateOfRestaurant.setText(R.string.state_closed);
            stateOfRestaurant.setTextColor(Color.RED);
        }

        ImageView restaurantImage = listItemView.findViewById(R.id.restaurant_image);
        restaurantImage.setImageResource(currentRestaurant.getrImageResourceId());

        return listItemView;
    }

}
