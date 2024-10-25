package com.example.fitness.ui.screen.fitness

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.data.ListOfSportes
import com.example.fitness.ui.screen.fitness.component.CyclingCard
import com.example.fitness.ui.screen.fitness.component.FitnessTitle
import com.example.fitness.ui.screen.fitness.component.SportCard
import com.example.fitness.ui.screen.fitness.component.WelcomeCard

@Composable
// TODO : Add Padding Values
fun Fitness(
    paddingValues: PaddingValues,
    modifier: Modifier=Modifier
){
    Column (
        modifier=modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(color = Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        FitnessTitle(Modifier.padding(top = 45.dp, start = 20.dp))
        LazyRow(
            contentPadding = PaddingValues(20.dp)
        ) {
                itemsIndexed(ListOfSportes){
                    index, item ->  SportCard(item.icon,item.description)
                }
            }
        WelcomeCard()
        Spacer(modifier = Modifier.height(27.dp))
        Text(
            text = "Cycling for the Weekend",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight(590) ,
                color = Color(0xFFFFFFFF),
            ),
            modifier = modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Energizing, 10-minute rides",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF97969C),
            ) ,
            modifier = modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow {
            items(4){
                CyclingCard()
            }
        }
    }

}
@Preview
@Composable
fun FitnessTitlePreview(modifier: Modifier = Modifier){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
       // Fitness()
    }
}