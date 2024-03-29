package com.ikanBilis.dimass.api.service

import com.ikanBilis.dimass.api.daily.DailyModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServiceDaily {
    @GET("mealplanner/generate")
    fun getDailyData(
        @Query("apiKey") apiKey : String,
        @Query("timeFrame") timeFrame : String,
        @Query("targetCalories") targetCalories : Int?,
        @Query("diet") diet : String?
    ) : Call<DailyModel>
}