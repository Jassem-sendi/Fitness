package com.example.fitness.ui.screen.workoutDetail.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.R
import com.example.fitness.data.ListOfWorkoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkOutTopBar(
    onNavigateBack:()->Unit
) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White,
        ),
        title = {
            Text(
                text = "Tue, Aug 9",
                maxLines = 1 ,
                overflow = TextOverflow.Ellipsis
            )
        } ,
        navigationIcon = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp , Alignment.Start) ,
                verticalAlignment = Alignment.CenterVertically ,
            ) {
                IconButton(onClick =  onNavigateBack ) {
                    Icon(
                        painter = painterResource(R.drawable.arrowback) ,
                        contentDescription = "Localized description",
                        tint = Color(0xFFC6F96F)
                    )
                }
                Text(
                    text = "Summary" ,
                    style = TextStyle(
                        fontSize = 16.sp ,
                        fontWeight = FontWeight(400) ,
                        color = Color(0xFFC6F96F) ,
                    )
                )
            }
        } ,
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(R.drawable.sharing) ,
                    contentDescription = "Localized description",
                    tint = Color(0xFFC6F96F)
                )
            }
        } ,
    )
}

@Preview(device = "id:pixel_8_pro")
@Composable
fun FitnessBottomBarPreview() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //WorkOutTopBar()
    }
}
