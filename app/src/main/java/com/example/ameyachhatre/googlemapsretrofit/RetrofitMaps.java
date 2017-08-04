package com.example.ameyachhatre.googlemapsretrofit;

/**
 * Created by Ameya on 7/19/2017.
 */

import com.example.ameyachhatre.googlemapsretrofit.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface RetrofitMaps {
    double MY_LAT = 39.004554;
    double MY_LONG = -76.875528;
    /*
     * Retrofit get annotation with our URL
     */
    @GET("api/place/textsearch/json?query=BBVA&location=MY_LAT,MY_LONG&radius=10000&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
