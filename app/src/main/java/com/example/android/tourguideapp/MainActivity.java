package com.example.android.tourguideapp;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView diningView = findViewById(R.id.dining_icon);
        diningView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(MainActivity.this, DiningActivity.class);
                startActivity(diningIntent);
            }
        });

        ImageView placesView = findViewById(R.id.places_icon);
        placesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        ImageView stayView = findViewById(R.id.stay_icon);
        stayView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stayIntent = new Intent(MainActivity.this, StayActivity.class);
                startActivity(stayIntent);
            }
        });

        ImageView tripsView = findViewById(R.id.trips_icon);
        tripsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tripsIntent = new Intent(MainActivity.this, TripActivity.class);
                startActivity(tripsIntent);
            }
        });
    }
}
