package com.example.android.tourguideapp;

/**
 * Created by User on 4/29/2018.
 */

public class Restaurant {
    private String rName;
    private String rAddress;
    private int openHour;
    private int closeHour;
    private int rImageResourceId;

    public Restaurant(String name, String address, int openHour, int closeHour, int id) {
        rName = name;
        rAddress = address;
        this.openHour = openHour;
        this.closeHour = closeHour;
        rImageResourceId = id;
    }

    public String getRestaurantName() {
        return rName;
    }

    public String getRestaurantAddress() {
        return rAddress;
    }

    public int getOpenHour() {
        return openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public int getrImageResourceId() {
        return rImageResourceId;
    }

}
