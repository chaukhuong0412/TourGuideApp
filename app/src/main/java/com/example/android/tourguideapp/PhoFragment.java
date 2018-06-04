package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PhoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pho, container, false);

        ArrayList<Restaurant> phoRestaurantsList = new ArrayList<Restaurant>();

        phoRestaurantsList.add(new Restaurant(getContext().getString(R.string.pho_hoa_name),getContext().getString(R.string.pho_hoa_address),8,22,R.drawable.pho_hoa));
        phoRestaurantsList.add(new Restaurant(getContext().getString(R.string.pho_24h_name),getContext().getString(R.string.pho_24h_address),10,20,R.drawable.pho_24));

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), phoRestaurantsList);
        ListView listView = rootView.findViewById(R.id.restaurant_list_view);
        listView.setAdapter(restaurantAdapter);
        return rootView;
    }

}
