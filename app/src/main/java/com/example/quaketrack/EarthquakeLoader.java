package com.example.quaketrack;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Place>> {
    private final String mUrl;
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }
    protected void onStartLoading() {
        forceLoad();
    }
    @Override
    public List<Place> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchEarthquakeData(mUrl);
    }
}
