package com.example.android.tourguide.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.R;
import com.example.android.tourguide.entity.DataMock;
import com.example.android.tourguide.fragment.BaseAttractionsFragment;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 15.03.18.
 */

public class DiscoverAdapter extends FragmentPagerAdapter {

    private ArrayList<String> titles = new ArrayList<>();

    public DiscoverAdapter(FragmentManager fm, Context context) {
        super(fm);
        titles.add(context.getString(R.string.fragment_title_attractions));
        titles.add(context.getString(R.string.fragment_title_museums));
        titles.add(context.getString(R.string.fragment_title_tours));
        titles.add(context.getString(R.string.fragment_title_restaurants));
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new BaseAttractionsFragment();
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                bundle.putParcelableArrayList(BaseAttractionsFragment.KEY_ATTRACTIONS, DataMock.getInstance().getAttractionsList());
                fragment.setArguments(bundle);
                return fragment;
            case 1:
                bundle.putParcelableArrayList(BaseAttractionsFragment.KEY_ATTRACTIONS, DataMock.getInstance().getMuseumsList());
                fragment.setArguments(bundle);
                return fragment;
            case 2:
                bundle.putParcelableArrayList(BaseAttractionsFragment.KEY_ATTRACTIONS, DataMock.getInstance().getToursList());
                fragment.setArguments(bundle);
                return fragment;
            case 3:
                bundle.putParcelableArrayList(BaseAttractionsFragment.KEY_ATTRACTIONS, DataMock.getInstance().getRestaurantsList());
                fragment.setArguments(bundle);
                return fragment;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
