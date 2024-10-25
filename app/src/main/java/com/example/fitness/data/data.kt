package com.example.fitness.data

import com.example.fitness.R

class BottomBarIcon(
    val icon:Int,
    val description:String
)
class Sports(
    val icon:Int,
    val description:String
)
class WorkOut (
    val name : String,
    val date : String,
    val timeOnSecond : Long
)
val ListOfSportes= listOf(
    Sports(R.drawable.fitness,"KICKBOXING"),
    Sports(R.drawable.fitness,"HIT"),
    Sports(R.drawable.baseline_mediation_24,"MEDITATION"),
    Sports(R.drawable.fitness,"BOX"),
    Sports(R.drawable.fitness,"PING PONG"),
    Sports(R.drawable.baseline_sports_football_24,"FOOTBALL"),
    Sports(R.drawable.baseline_sports_handball_24,"HANDBALL"),
    Sports(R.drawable.baseline_sports_volleyball_24,"VOLLEYBALL"),
)
val BottomBarIcons= listOf(
    BottomBarIcon(R.drawable.summary,"summary"),
    BottomBarIcon(R.drawable.fitness,"fitness+"),
    BottomBarIcon(R.drawable.sharing,"sharing"),
)
val ListOfWorkoutes = listOf(
    WorkOut("Traditional Strength Training1","8/9/22",5000),
    WorkOut("Traditional Strength Training2","9/9/22",10000),
    WorkOut("Traditional Strength Training3","10/9/22",300),
)
