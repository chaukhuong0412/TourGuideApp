package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BanhMiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_banhmi, container, false);

        // Create a Banh-Mi-Restaurant list
        ArrayList<Restaurant> banhMiRestaurantsList = new ArrayList<>();

        // Add somes Bun-Thit-Restaurants to the list
        banhMiRestaurantsList.add(new Restaurant(getContext().getString(R.string.banhmi_hoian_name), getContext().getString(R.string.banhmi_hoian_address), 8, 22, R.drawable.banh_mi_hoi_an));
        banhMiRestaurantsList.add(new Restaurant(getContext().getString(R.string.banhmi_the_name), getContext().getString(R.string.banhmi_the_address), 10, 20, R.drawable.the_banh_mi));
        banhMiRestaurantsList.add(new Restaurant(getContext().getString(R.string.banhmi_chao_name), getContext().getString(R.string.banhmi_chao_address), 8, 20, R.drawable.banh_mi_chao));
        banhMiRestaurantsList.add(new Restaurant(getContext().getString(R.string.banhmi_hoama_name), getContext().getString(R.string.banhmi_hoama_address), 0, 13, R.drawable.banh_mi_hoa_ma));

        // Create an Adapter and set it for the list view
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), banhMiRestaurantsList);
        ListView listView = rootView.findViewById(R.id.restaurant_list_view);
        listView.setAdapter(restaurantAdapter);
        return rootView;
    }

}
