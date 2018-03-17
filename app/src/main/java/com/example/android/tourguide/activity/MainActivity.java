package com.example.android.tourguide.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.DiscoverAdapter;
import com.example.android.tourguide.entity.DataMock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing data requires a context, so this needs to be called as soon as possible
        DataMock.getInstance().initData(this);

        // Setup the pager
        ViewPager viewPager = findViewById(R.id.viewpager);
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(discoverAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
