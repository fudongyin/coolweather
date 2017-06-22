package com.example.coolweather.gson;

/**
 * Created by Administrator on 2017/6/22 0022.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
