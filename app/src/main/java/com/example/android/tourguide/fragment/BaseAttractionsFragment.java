package com.example.android.tourguide.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.AttractionAdapter;
import com.example.android.tourguide.entity.AttractionEntry;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 15.03.18.
 */

public class BaseAttractionsFragment extends Fragment {

    // Private variables
    private ArrayList<AttractionEntry> attractionEntries;

    // Public constants
    public static final String KEY_ATTRACTIONS = "attractions";

    // Constructors
    public BaseAttractionsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Get data from the fragment arguments
        Bundle args = getArguments();
        if (args != null && args.containsKey(KEY_ATTRACTIONS)) {

            attractionEntries = args.getParcelableArrayList(KEY_ATTRACTIONS);

            // Provide the list view with attractions adapter
            AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractionEntries);
            ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);

            // Provide on click listener to open web browser on item click
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    AttractionEntry attractionEntry = attractionEntries.get(position);
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(attractionEntry.getUrl()));
                    startActivity(intent);
                }
            });
        }

        return rootView;
    }
}
