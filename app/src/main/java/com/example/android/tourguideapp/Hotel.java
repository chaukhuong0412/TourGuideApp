package com.example.android.tourguideapp;

/**
 * Created by User on 4/30/2018.
 */

public class Hotel {

    private String hName;
    private String hAddress;
    private int minimumPrice;
    private int maximumPrice;
    private int hImageSourceId;

    public Hotel(String name, String address, int minimum, int maximum, int id) {
        hName = name;
        hAddress = address;
        minimumPrice = minimum;
        maximumPrice = maximum;
        hImageSourceId = id;
    }

    public String getHotelName() {
        return hName;
    }

    public String getHotelAddress() {
        return hAddress;
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public int getMaximumPrice() {
        return maximumPrice;
    }

    public int getHotelImageSourceId() {
        return hImageSourceId;
    }

}
