package com.example.android.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new StayFragment())
                .commit();

        ViewPager viewPager = findViewById(R.id.viewpager);
        FragmentPagerInformationAdapter adapter = new FragmentPagerInformationAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(2);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}