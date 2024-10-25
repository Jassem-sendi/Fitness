package com.example.fitness.ui.screen.summary

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.fitness.data.ListOfWorkoutes
import com.example.fitness.navigation.Routes
import com.example.fitness.navigation.WorkoutScreen
import com.example.fitness.ui.screen.summary.component.SummaryCard
import com.example.fitness.ui.screen.summary.component.SummaryTopBar
import com.example.fitness.ui.screen.workoutDetail.WorkDetail


@Composable
fun Summary(
    paddingValues: PaddingValues ,
) {
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = Routes.Summary) {
        composable<Routes.Summary> {
            LazyColumn(
                contentPadding = PaddingValues(8.dp) ,
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                item {
                    Spacer(Modifier.height(28.dp))
                    SummaryTopBar()
                    Spacer(Modifier.height(58.dp))
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
                }
                itemsIndexed(ListOfWorkoutes) { index , item ->
                    SummaryCard(workOut = item , onNavigate = {
                        navController.navigate(
                           WorkoutScreen(
                               index
                           )
                        )
                    })
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
        composable<WorkoutScreen> {
            val args = it.toRoute<WorkoutScreen>()
                WorkDetail(args.index, onNavigateBack = {navController.popBackStack()})
        }
    }

}
