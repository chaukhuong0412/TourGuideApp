package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class DiningFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dining, container, false);

        //Implement ComTam Activity
        ImageView comTamView = rootView.findViewById(R.id.com_tam_icon);
        comTamView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(getActivity(), ComTamActivity.class);
                startActivity(diningIntent);
            }
        });

        //Implement Pho Activity
        ImageView phoView = rootView.findViewById(R.id.pho_icon);
        phoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(getActivity(), PhoActivity.class);
                startActivity(diningIntent);
            }
        });

        //Implement BanhMi Activity
        ImageView banhMiView = rootView.findViewById(R.id.banh_mi_icon);
        banhMiView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(getActivity(), BanhMiActivity.class);
                startActivity(diningIntent);
            }
        });

        //Implement BanhMi Activity
        ImageView bunThitView = rootView.findViewById(R.id.bun_thit_icon);
        bunThitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(getActivity(), BunThitActivity.class);
                startActivity(diningIntent);
            }
        });

        return  rootView;

    }
}
