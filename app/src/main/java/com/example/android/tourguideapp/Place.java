package com.example.android.tourguideapp;

/**
 * Created by User on 4/29/2018.
 */

public class Place {
    private String pName;
    private String pAddress;
    private String pType;
    private int openHour;
    private int closeHour;
    private int pImageResourceId;


    public Place(String name, String address, String type, int openHour, int closeHour, int id) {
        pName = name;
        pAddress = address;
        pType = type;
        this.openHour = openHour;
        this.closeHour = closeHour;
        pImageResourceId = id;
    }

    public String getPlaceName() {
        return pName;
    }

    public String getPlaceAddress() {
        return pAddress;
    }

    public String getPlaceType() {
        return pType;
    }

    public int getOpenHour() {
        return openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public int getPlaceImageResourceId() {
        return pImageResourceId;
    }

}
