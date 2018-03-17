package com.example.android.tourguide.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.entity.AttractionEntry;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 15.03.18.
 */

public class AttractionAdapter extends ArrayAdapter<AttractionEntry> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_list_item, parent, false);
        }

        AttractionEntry attractionEntry = getItem(position);

        // setup image view
        ImageView attractionPhotoImageView = listItemView.findViewById(R.id.attraction_photo_image_view);
        attractionPhotoImageView.setImageResource(attractionEntry.getImageResourceID());

        // setup title text view
        TextView attractionTitleTextView = listItemView.findViewById(R.id.attraction_title_text_view);
        attractionTitleTextView .setText(attractionEntry.getTitle());

        // setup subtitle text view
        TextView attractionSubtitleTextView = listItemView.findViewById(R.id.attraction_subtitle_text_view);
        attractionSubtitleTextView .setText(attractionEntry.getSubtitle());

        return listItemView;
    }

    public AttractionAdapter(Activity context, ArrayList<AttractionEntry> attractionEntries) {
        super(context, 0, attractionEntries);
    }
}
