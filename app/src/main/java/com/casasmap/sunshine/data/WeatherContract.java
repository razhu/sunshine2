package com.casasmap.sunshine.data;

import android.provider.BaseColumns;

/**
 * Created by ramiro on 10/21/15.
 */
public class WeatherContract {
    public static final class WeatherEntry implements BaseColumns{
        public static final String TABLE_NAME = "weather";
        public static final String COLUMN_LOCK_KEY = "location_id";
        public static final String COLUMN_DATETEXT = "date";
// and so on...
        public static final String COLUMN_WEATHER_ID = "weather_id";
    }
    public static final class LocationEntry implements BaseColumns{

    }

}
