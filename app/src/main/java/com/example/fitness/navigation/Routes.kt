package com.example.fitness.navigation

import kotlinx.serialization.Serializable

class Routes {
    @Serializable
    object Summary
}

@Serializable
data class WorkoutScreen(
    val index:Int
)
data class TimerScreen (
    val time:Long
)


