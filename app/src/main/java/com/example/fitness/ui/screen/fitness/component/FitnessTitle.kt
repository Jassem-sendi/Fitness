package com.example.fitness.ui.screen.fitness.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.R

@Composable
fun FitnessTitle(modifier: Modifier=Modifier){
    Row (
        modifier=modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.apple_icon),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(42.dp)
        )
        Text(
            text = "Fitness+",
            style = TextStyle(
                fontSize = 36.sp,
                fontWeight = FontWeight(510) ,
                color = Color(0xFFFFFFFF),
            )
        )
    }
}
@Preview
@Composable
fun FitnessTitlePreview(modifier: Modifier=Modifier){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        FitnessTitle()
    }
}