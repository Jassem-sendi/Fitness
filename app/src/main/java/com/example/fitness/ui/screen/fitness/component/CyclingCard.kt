package com.example.fitness.ui.screen.fitness.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CyclingCard(){
    Column (
        verticalArrangement = Arrangement.spacedBy(7.dp),
        modifier = Modifier.padding(start = 20.dp)
    ) {
        Box (
            modifier = Modifier
                .width(229.dp)
                .height(136.dp)
                .background(color = Color(0xFF242424) , shape = RoundedCornerShape(size = 6.dp))
        )
        Text(
            text = "Cycling with Rahul",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400) ,
                color = Color(0xFFE9E9E9),
            )
        )
        Text(
            text = "10min.Latest Hits.Ep86",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFE9E9E9),
            )
        )
    }
}