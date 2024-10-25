package com.example.fitness.ui.screen.summary.component

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun SummaryTopBar(modifier: Modifier=Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(152.dp, Alignment.Start),
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(9.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = "SUNDAY, APR 9",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(510) ,
                    color = Color(0xFF6B6B6B),
                )
            )
            Text(
                text = "Summary",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight(510),
                    color = Color(0xFFFFFFFF),
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.rectangle_4446),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(36.dp)
                .height(36.dp)
        )
    }
}

@Preview
@Composable
fun SummaryTopBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        SummaryTopBar()
    }
}
