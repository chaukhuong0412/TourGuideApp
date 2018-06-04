package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComTamFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_comtam, container, false);

        // Create a Com-Tam-Restaurant list
        ArrayList<Restaurant> comTamRestaurantsList = new ArrayList<>();

        // Add somes Com-Tam-Restaurants to the list
        comTamRestaurantsList.add(new Restaurant(getContext().getString(R.string.comtam_kieugiang_name),getContext().getString(R.string.comtam_kieugiang_address),8,22,R.drawable.com_tam_kieu_giang));
        comTamRestaurantsList.add(new Restaurant(getContext().getString(R.string.comtam_cali_name),getContext().getString(R.string.comtam_cali_address),10,20,R.drawable.com_tam_cali));

        // Create an Adapter and set it for the list view
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), comTamRestaurantsList);
        ListView listView = rootView.findViewById(R.id.restaurant_list_view);
        listView.setAdapter(restaurantAdapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
