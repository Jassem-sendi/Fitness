package com.example.fitness.ui.screen.workoutDetail

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitness.Countdown
import com.example.fitness.FitnessBottomBar
import com.example.fitness.navigation.WorkoutScreen
import com.example.fitness.ui.screen.workoutDetail.component.WorkOutDetailsCard
import com.example.fitness.ui.screen.workoutDetail.component.WorkOutInfo
import com.example.fitness.ui.screen.workoutDetail.component.WorkOutTopBar

@Composable
fun WorkDetail(
    workoutIndex: Int ,
    onNavigateBack: () -> Unit
) {
    val navController = rememberNavController()
    var isWorkoutStart by rememberSaveable { mutableStateOf(false) }
    Scaffold(
        topBar = {
            WorkOutTopBar(onNavigateBack = onNavigateBack)
        } ,
        bottomBar = {
            FitnessBottomBar(0 , {})
        }
    ) { PaddingValues ->
        if (!isWorkoutStart) {
            Column(
                Modifier
                    .padding(PaddingValues)
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Spacer(Modifier.height(25.dp))
                WorkOutInfo(workoutIndex)
                Spacer(Modifier.height(25.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween ,
                    verticalAlignment = Alignment.CenterVertically ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Text(
                        text = "Workouts" ,
                        style = TextStyle(
                            fontSize = 22.sp ,
                            fontWeight = FontWeight(510) ,
                            color = Color(0xFFFFFFFF) ,
                        )
                    )
                    Text(
                        text = "Show More" ,
                        style = TextStyle(
                            fontSize = 18.sp ,
                            fontWeight = FontWeight(400) ,
                            color = Color(0xFFC6F96F) ,
                        )
                    )
                }
                Spacer(Modifier.height(14.dp))

                WorkOutDetailsCard(index = workoutIndex , isWorkoutStart) {
                    isWorkoutStart = it
                }
            }
        }
        else{
            Countdown()
        }
    }
}

@Preview(device = "id:pixel_8_pro")
@Composable
fun FitnessBottomBarPreview() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

    }
}
