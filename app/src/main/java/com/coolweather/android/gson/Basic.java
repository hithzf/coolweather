package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hzf on 2017/3/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
