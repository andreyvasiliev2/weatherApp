package com.example.weatherappcurse

import java.util.concurrent.locks.Condition

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String,
    val hours: String
)
