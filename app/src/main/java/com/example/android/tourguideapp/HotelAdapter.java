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
public class HotelAdapter extends ArrayAdapter<Hotel> {

    public HotelAdapter(Activity context, ArrayList<Hotel> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_hotel, parent, false);
        }

        Hotel currentHotel = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.hotel_name);
        nameTextView.setText(currentHotel.getHotelName());

        TextView addressTextView = listItemView.findViewById(R.id.hotel_address);
        addressTextView.setText(currentHotel.getHotelAddress());

        TextView minMaxTextView = listItemView.findViewById(R.id.min_max_price);
        String minMaxText = getContext().getString(R.string.from) + currentHotel.getMinimumPrice() + getContext().getString(R.string.usd_to) + currentHotel.getMaximumPrice() + getContext().getString(R.string.usd);
        minMaxTextView.setText(minMaxText);

        ImageView hotelImage = listItemView.findViewById(R.id.hotel_image);
        hotelImage.setImageResource(currentHotel.getHotelImageSourceId());

        return listItemView;
    }
}
