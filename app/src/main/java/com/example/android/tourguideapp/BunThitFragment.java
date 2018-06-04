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

public class BunThitFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_bunthit, container, false);

        // Create a Bun-Thit-Restaurant list
        ArrayList<Restaurant> bunThitRestaurantsList = new ArrayList<Restaurant>();

        // Add somes Bun-Thit-Restaurants to the list
        bunThitRestaurantsList.add(new Restaurant(getContext().getString(R.string.bunthit_haidang_name),getContext().getString(R.string.bunthit_haidang_address),8,22,R.drawable.bun_thit_hai_dang));
        bunThitRestaurantsList.add(new Restaurant(getContext().getString(R.string.bunthi_anhba_name),getContext().getString(R.string.bunthit_anhba_address),10,20,R.drawable.bun_thit_anh_ba));
        bunThitRestaurantsList.add(new Restaurant(getContext().getString(R.string.bunthit_kieubao_name),getContext().getString(R.string.bunthit_kieubao_address),8,20,R.drawable.bun_thit_kieu_bao));
        bunThitRestaurantsList.add(new Restaurant(getContext().getString(R.string.bunthit_thoiquan_name),getContext().getString(R.string.bunthit_thoiquan_address),0,13,R.drawable.bun_thit_thoi_quan));

        // Create an Adapter and set it for the list view
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), bunThitRestaurantsList);
        ListView listView = (ListView) rootView.findViewById(R.id.restaurant_list_view);
        listView.setAdapter(restaurantAdapter);
        return rootView;
    }

}
