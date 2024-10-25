package com.example.fitness.ui.screen.fitness.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.R

@Composable
fun WelcomeCard(){
    Column (
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF1C1C1C), shape = RoundedCornerShape(size = 4.dp))
            .padding(10.dp)
    ) {
        Text(
            text = "Welcome to Fitness+",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(510) ,
                color = Color(0xFFC9FC6E),
                textAlign = TextAlign.Center,
            )
        )
        Text(
            text = "Everything you need \nto know to get started",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(510),
                color = Color(0xFFFFFFFF),
            )
        )
        Icon(
            painter = painterResource(R.drawable.baseline_play_circle_24),
            contentDescription = null,
            tint = Color(0xFF5A5A5A),
            modifier = Modifier
                .padding(1.dp)
                .width(27.dp)
                .height(27.dp)
                .align(Alignment.End)
        )
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
        WelcomeCard()
    }
}
