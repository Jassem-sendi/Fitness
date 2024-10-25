package com.example.fitness.ui.screen.summary.component
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.example.fitness.data.WorkOut
@Composable
fun SummaryCard(
    workOut: WorkOut,
    onNavigate :  ()->Unit
){
    Row(
        horizontalArrangement = Arrangement.spacedBy(9.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF1C1C1C), shape = RoundedCornerShape(size = 10.dp))
            .padding(start = 14.dp, top = 12.dp, end = 14.dp, bottom = 12.dp)
            .clickable {
                onNavigate()
            }


    ) {
        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "image description",
            contentScale = ContentScale.None
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = workOut.name,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(400) ,
                    color = Color(0xFFFFFFFF),
                )
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = workOut.timeOnSecond.formatTime(),
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFC6F96F),
                    )
                )
                Text(
                    text = workOut.date,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF8D8D8E),
                    ),
                    maxLines = 1
                )
            }
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
        //SummaryCard(workOut = ListOfWorkoutes[2])
    }
}
fun Long.formatTime(): String {
    val hours = this / 3600
    val minutes = (this % 3600) / 60
    val remainingSeconds = this % 60
    return String.format("%02d:%02d:%02d",hours, minutes, remainingSeconds)
}
