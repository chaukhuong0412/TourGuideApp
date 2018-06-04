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
public class TripFragment extends Fragment {


    public TripFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_trip, container, false);

        ArrayList<Trip> tripsList = new ArrayList<Trip>();

        tripsList.add(new Trip(getContext().getString(R.string.mekong_tour), 2, 200, R.drawable.mekong_trip));
        tripsList.add(new Trip(getContext().getString(R.string.saigon_river_tour),  1, 50, R.drawable.saigon_river_trip));

        TripAdapter tripAdapter = new TripAdapter(getActivity(), tripsList);
        ListView listView = (ListView) rootView.findViewById(R.id.trip_list_view);
        listView.setAdapter(tripAdapter);
        return rootView;
    }

}
