package com.example.fitness.ui.screen.sharing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun Sharing(
    paddingValues: PaddingValues ,
    modifier: Modifier=Modifier
) {
    Column (
        modifier = modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Icon(
            painter = painterResource(R.drawable.add_account),
            contentDescription = null,
            tint = Color(0xFFC9FC6E),
            modifier = Modifier
                .padding(11.dp)
                .align(alignment = Alignment.End)
        )
        Spacer(modifier=Modifier.height(17.dp))
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()

        ) {
            Text(
                text = "Sharing",
                style = TextStyle(
                    fontSize = 34.sp,

                    fontWeight = FontWeight(590) ,
                    color = Color(0xFFFFFFFF),
                ),
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(
                text = "Share Activity",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                ),
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "See how your data is managed..",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFC9FC6E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview
@Composable
fun SharingPreview() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //Sharing()
    }
}