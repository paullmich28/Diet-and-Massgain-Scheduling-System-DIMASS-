package com.example.dimass.api.weekly.days

import com.example.dimass.api.weekly.MealWeekly
import com.example.dimass.api.weekly.NutrientsWeekly

data class Friday(
    val meals: List<MealWeekly>,
    val nutrients: NutrientsWeekly
)