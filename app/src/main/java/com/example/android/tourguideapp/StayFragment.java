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
public class StayFragment extends Fragment {


    public StayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_stay, container, false);

        ArrayList<Hotel> hotelsList = new ArrayList<>();

        hotelsList.add(new Hotel(getContext().getString(R.string.hotel_newworld_name), getContext().getString(R.string.hotel_newworld_address), 20, 300, R.drawable.new_world_hotel));
        hotelsList.add(new Hotel(getContext().getString(R.string.hotel_sheraton_name), getContext().getString(R.string.hotel_sheraton_address), 10, 200, R.drawable.sheraton_hotel));
        hotelsList.add(new Hotel(getContext().getString(R.string.hotel_novotel_name), getContext().getString(R.string.hotel_novotel_address),  35, 600, R.drawable.novotel_hotel));

        HotelAdapter hotelAdapter = new HotelAdapter(getActivity(), hotelsList);
        ListView listView = rootView.findViewById(R.id.stay_list_view);
        listView.setAdapter(hotelAdapter);
        return rootView;
    }

}
