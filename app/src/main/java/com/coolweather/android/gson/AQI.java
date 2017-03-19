package com.coolweather.android.gson;

/**
 * Created by hzf on 2017/3/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
