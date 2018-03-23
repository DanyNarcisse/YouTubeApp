package com.danynarcisse.youtubeapp;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Dany on 3/16/2018.
 */

//Methods that make the http request to get the data
public interface YoutubeService {
    @GET("search")
    Call<YoutubeVideoResult> GetVideo (
            @Query( "key")String api_key ,
            @Query( "part") String part ,
            @Query( "q") String q ,
            @Query("maxResults") int max_result);
}
