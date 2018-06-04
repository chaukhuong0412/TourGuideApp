package com.example.android.tourguideapp;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class FragmentPagerRestaurantAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;


    public FragmentPagerRestaurantAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_banhmi);
        } else if (position == 1) {
            return mContext.getString(R.string.category_pho);
        } else if (position == 2) {
            return mContext.getString(R.string.category_comtam);
        } else {
            return mContext.getString(R.string.category_bunthit);
        }

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BanhMiFragment();
        } else if (position == 1) {
            return new PhoFragment();
        } else if (position == 2) {
            return new ComTamFragment();
        } else {
            return new BunThitFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}