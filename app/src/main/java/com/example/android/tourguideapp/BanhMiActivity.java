package com.example.android.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BanhMiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BanhMiFragment())
                .commit();

        // Create a view pager that will allow the user to swipe between fragments and set an adapter for it
        ViewPager viewPager = findViewById(R.id.viewpager);
        FragmentPagerRestaurantAdapter adapter = new FragmentPagerRestaurantAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Create TabLayout for pager
        TabLayout tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
