package com.example.android.tourguideapp;

/**
 * Created by User on 4/30/2018.
 */

public class Trip {

    private String tName;
    private int tDuration;
    private int tCost;
    private int tImageSourceId;

    public Trip(String name, int duration, int cost, int id) {
        tName = name;
        tDuration = duration;
        tCost = cost;
        tImageSourceId = id;
    }

    public String getTripName() {
        return tName;
    }

    public int getTripDuration() {
        return tDuration;
    }

    public int getTripCost() {
        return tCost;
    }

    public int getTripImageSourceId() {
        return tImageSourceId;
    }
}
