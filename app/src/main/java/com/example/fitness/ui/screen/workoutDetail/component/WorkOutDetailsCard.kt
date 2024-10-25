package com.example.fitness.ui.screen.workoutDetail.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.R
import com.example.fitness.data.ListOfWorkoutes
import com.example.fitness.ui.screen.summary.component.formatTime


@Composable
fun WorkOutDetailsCard(
    index:Int,
    isStarted :Boolean,
    onClick : (Boolean)->Unit
){


        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .background(color = Color(0xFF1C1C1C) , shape = RoundedCornerShape(size = 10.dp))
                .padding(start = 14.dp , top = 12.dp , end = 14.dp , bottom = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(77.dp, Alignment.Start),
                verticalAlignment = Alignment.Top,
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {
                    Text(
                        text = "Workout Time",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(400) ,
                            color = Color(0xFFFFFFFF),
                        )
                    )
                    Text(
                        text = ListOfWorkoutes[index].timeOnSecond.formatTime(),
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFC6F96F),
                        )
                    )
                }
                //
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {
                    Text(
                        text = "Active Calories",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                    Text(
                        text = "0CAL",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFD34657),
                        )
                    )
                }
            }
            Button(
                onClick = {
                    onClick(!isStarted)
                }
                ,
                colors =ButtonColors(
                    containerColor = Color(0xFFC6F96F),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Gray
                ),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Start Workout",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(590),
                        color = Color(0xFF000000),
                    )
                )
            }
        }


}

@Preview
@Composable
fun WorkOutDetailsCardPreview(){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //WorkOutDetailsCard(1)
    }
}