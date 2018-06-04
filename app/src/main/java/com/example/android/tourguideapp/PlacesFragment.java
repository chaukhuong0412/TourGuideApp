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
public class PlacesFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        ArrayList<Place> placesList = new ArrayList<>();

        placesList.add(new Place(getContext().getString(R.string.reunification_palace_name), getContext().getString(R.string.reunification_palace_address), getContext().getString(R.string.historical_place) , 8, 16, R.drawable.reunification_palace));
        placesList.add(new Place(getContext().getString(R.string.notre_dame_name), getContext().getString(R.string.notre_dame_address), getContext().getString(R.string.church), 8, 17, R.drawable.notre_dame_cathedral));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), placesList);
        ListView listView = rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(placeAdapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
