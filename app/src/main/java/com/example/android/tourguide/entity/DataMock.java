package com.example.android.tourguide.entity;


import android.content.res.Resources;

import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Created by ammar_saaddine on 14.03.18.
 */

/// This class is to mock the data songs

public class DataMock {

    // Private properties
    private String aboutText;
    private ArrayList<AttractionEntry> attractions;
    private ArrayList<AttractionEntry> museums;
    private ArrayList<AttractionEntry> tours;
    private ArrayList<AttractionEntry> restaurants;

    // The shared instance of this class
    private static DataMock instance = null;


    // Constructors
    // private because it's a singleton
    private DataMock() {
        initData();
    }

    // Public methods

    public static DataMock getInstance() {
        if (instance == null) {
            instance = new DataMock();
        }
        return instance;
    }

    public String getAboutText() {
        return aboutText;
    }

    public ArrayList<AttractionEntry> getAttractions() {
        return attractions;
    }

    public ArrayList<AttractionEntry> getMuseums() {
        return museums;
    }

    public ArrayList<AttractionEntry> getTours() {
        return tours;
    }

    public ArrayList<AttractionEntry> getRestaurants() {
        return restaurants;
    }

    // Private methods

    // Create the songs list
    private void initData() {
        initAttraction();
        initMuseums();
        initTours();
        initRestaurants();
    }

    private void initAttraction() {
        attractions = new ArrayList<>();
        attractions.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.tv_tower_title),
                Resources.getSystem().getString(R.string.tv_tower_subtitle),
                R.drawable.tv_tower,
                "https://buchen.visitberlin.de/VisitBerlin/offer/?Reset=1&date_unknown=1&doSearch=1&offer_searchtext=fernsehturm&serviceFeatures[]=BTM00020100222193529&lang=en&_ga=2.78790365.815371158.1521059348-1909495685.1520886464"));
        attractions.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.gendarmenmarkt_title),
                Resources.getSystem().getString(R.string.gendarmenmarkt_subtitle),
                R.drawable.gendarmenmarkt,
                "https://www.visitberlin.de/en/gendarmenmarkt"));
        attractions.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.gendarmenmarkt_title),
                Resources.getSystem().getString(R.string.gendarmenmarkt_subtitle),
                R.drawable.brandenburg_gate,
                "https://www.visitberlin.de/en/brandenburg-gate"));
        attractions.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.reichstag_title),
                Resources.getSystem().getString(R.string.reichstag_subtitle),
                R.drawable.reichstag,
                "https://www.visitberlin.de/en/government-district"));
        attractions.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.days_berlin_title),
                Resources.getSystem().getString(R.string.days_berlin_subtitle),
                R.drawable.days_berlin,
                "https://www.visitberlin.de/en/3-days-berlin"));
    }

    private void initMuseums() {
        museums = new ArrayList<>();
        museums.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.museums_island_title),
                Resources.getSystem().getString(R.string.museums_children_subtitle),
                R.drawable.museums_island,
                "https://www.visitberlin.de/en/museum-island-in-berlin"));
        museums.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.top_exhibitions_title),
                Resources.getSystem().getString(R.string.top_exhibitions_subtitle),
                R.drawable.top_exhibitions,
                "https://www.visitberlin.de/en/top-exhibitions-berlin"));
        museums.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.museums_tickets_title),
                Resources.getSystem().getString(R.string.museums_tickets_subtitle),
                R.drawable.museums_tickets,
                "https://www.visitberlin.de/en/tickets-museums-exhibitions-berlin"));
        museums.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.museums_children_title),
                Resources.getSystem().getString(R.string.museums_children_subtitle),
                R.drawable.museums_children,
                "https://www.visitberlin.de/en/museums-children"));
    }

    private void initTours() {
        tours = new ArrayList<>();
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.tour_bus_title),
                Resources.getSystem().getString(R.string.tour_boat_subtitle),
                R.drawable.tour_bus,
                "https://www.visitberlin.de/en/hop-on-hop-off-bus-tours-berlin"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.tour_boat_title),
                Resources.getSystem().getString(R.string.tour_boat_subtitle),
                R.drawable.tour_boat,
                "https://www.visitberlin.de/en/link-teaser/boat-tours-spree-cruises"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.tour_walking_title),
                Resources.getSystem().getString(R.string.tour_walking_subtitle),
                R.drawable.tour_walking,
                "https://www.visitberlin.de/en/guided-walking-tour-berlin"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.tour_cycling_title),
                Resources.getSystem().getString(R.string.tour_cycling_subtitle),
                R.drawable.tour_cycling,
                "https://www.visitberlin.de/en/cycling-tours-berlin"));
    }

    private void initRestaurants() {
        tours = new ArrayList<>();
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.restaurants_tips_title),
                Resources.getSystem().getString(R.string.restaurants_tips_subtitle),
                R.drawable.restaurants_tips,
                "https://www.visitberlin.de/en/restaurant-tips-around-berlin-sights"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.restaurants_events_title),
                Resources.getSystem().getString(R.string.restaurants_events_subtitle),
                R.drawable.restaurants_events,
                "https://www.visitberlin.de/en/food-events"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.restaurants_cuisine_title),
                Resources.getSystem().getString(R.string.restaurants_cuisine_subtitle),
                R.drawable.restaurants_cuisine,
                "https://www.visitberlin.de/en/berlin-cuisine"));
        tours.add(new AttractionEntry(
                Resources.getSystem().getString(R.string.restaurants_groups_title),
                Resources.getSystem().getString(R.string.restaurants_groups_subtitle),
                R.drawable.restaurants_groups,
                "https://www.visitberlin.de/en/restaurants-groups"));
    }


}
