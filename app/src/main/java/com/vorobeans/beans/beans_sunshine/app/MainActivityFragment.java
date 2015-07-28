package com.vorobeans.beans.beans_sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // fake data to populate the list of forecasts
        String[] forecastArray = {
                "Today - Rainy - 88/63",
                "Tomorrow - Rainy - 82/60",
                "Tuesday - Sunny - 80/59",
                "Wednesday - Cloudy - 76/58",
                "Thursday - Sunny - 74/57",
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));


        // initialize an arrayadapter to handle the creation and manipulation of the dataset to be fed into the textviews to be drawn on screen
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                getActivity(), // context
                R.layout.list_item_forecast, // id of the layout
                R.id.list_item_forecast_textview, // id of the textview
                weekForecast // fake forecast data
        );

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // create the list view
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
