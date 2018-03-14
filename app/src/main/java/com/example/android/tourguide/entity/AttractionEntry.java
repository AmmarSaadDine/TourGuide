package com.example.android.tourguide.entity;

/**
 * Created by ammar_saaddine on 14.03.18.
 */

public class AttractionEntry {

    // Private properties
    private String title;
    private String subtitle;
    private int imageResourceID;
    private String url;

    // Constructor

    public AttractionEntry(String title, String subtitle, int imageResourceID, String url) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageResourceID = imageResourceID;
        this.url = url;
    }

    // Public methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
