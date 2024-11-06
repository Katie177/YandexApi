package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Temp {

    public static String temp (String response) {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        YandexApiResponse apiResponse;
        apiResponse = gson.fromJson(response, YandexApiResponse.class);
        String temp = apiResponse.fact.temp;

        return temp;

    }
    public static int tempAvg (String response) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        YandexApiResponse apiResponse;
        apiResponse = gson.fromJson(response, YandexApiResponse.class);
        int days = 0;
        int avgSumm = 0;
        for ( int i=0; i < apiResponse.forecasts.length; i++) {
            days++;
            avgSumm += Integer.parseInt(apiResponse.forecasts[i].parts.day.temp_avg);
        }
        int avg = avgSumm / days;
        return avg;
    }
}


