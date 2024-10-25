package com.example.fitness.ui.screen.workoutDetail.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.fitness.data.ListOfWorkoutes

@Composable
fun WorkOutInfo(
    index:Int
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(9.dp , Alignment.Start) ,
        verticalAlignment = Alignment.CenterVertically ,
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .background(color = Color(0x1E000000) , shape = RoundedCornerShape(size = 10.dp))
            .padding(start = 14.dp , top = 12.dp , end = 14.dp , bottom = 12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon) ,
            contentDescription = "image description" ,
            contentScale = ContentScale.None
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp , Alignment.Top) ,
            horizontalAlignment = Alignment.Start ,
        ) {
            Text(
                text = ListOfWorkoutes[index].name ,
                style = TextStyle(
                    fontSize = 18.sp ,
                    fontWeight = FontWeight(400) ,
                    color = Color(0xFFFFFFFF) ,
                )
            )

            Text(
                text = "3:05 AM - 3:07 AM" ,
                style = TextStyle(
                    fontSize = 16.sp ,
                    fontWeight = FontWeight(400) ,
                    color = Color(0xFF8D8D8E) ,

                    ) ,
                maxLines = 1
            )
        }
    }
}

@Preview
@Composable
fun SummaryCardPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        WorkOutInfo(0)
    }
}