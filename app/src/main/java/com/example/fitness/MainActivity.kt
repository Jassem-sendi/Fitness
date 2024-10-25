package com.example.fitness


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.data.BottomBarIcons
import com.example.fitness.ui.screen.fitness.Fitness
import com.example.fitness.ui.screen.sharing.Sharing
import com.example.fitness.ui.screen.summary.Summary
import com.example.fitness.ui.theme.FitnessTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessTheme {
                var selectedIndex by rememberSaveable {
                    mutableIntStateOf(0)
                }
                Scaffold(
                    bottomBar = {
                        FitnessBottomBar(
                            selectedIndex = selectedIndex ,
                            Onclick = { selectedIndex = it })
                    } ,
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                ) { paddingValues ->
                    ScreenToDisplay(
                        selectedIndex = selectedIndex ,
                        paddingValues = paddingValues,

                    )
                }
            }

        }
    }
}
@Composable
fun ScreenToDisplay(
    selectedIndex: Int ,
    paddingValues: PaddingValues,
) {
    when (selectedIndex) {
        0 -> Summary(paddingValues)
        1 -> Fitness(paddingValues)
        else -> Sharing(paddingValues)
    }
}

@Composable
fun FitnessBottomBar(
    selectedIndex: Int ,
    Onclick: (Int) -> Unit
) {
    Column {
        HorizontalDivider(thickness = 1.dp , color = Color.Gray)
        Row(
            horizontalArrangement = Arrangement.SpaceAround ,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(11.25.dp)
        ) {
            LazyRow(
                horizontalArrangement = Arrangement.SpaceAround ,
                modifier = Modifier.fillMaxWidth()
            ) {
                items(BottomBarIcons.size) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally ,
                        verticalArrangement = Arrangement.Center
                    ) {
                        IconButton(onClick = {
                            Onclick(it)
                            println("the selected index is $it")
                        }) {
                            Icon(
                                painter = painterResource(BottomBarIcons[it].icon) ,
                                contentDescription = BottomBarIcons[it].description ,
                                tint = if (selectedIndex == it) Color(0xFFC9FC6E) else Color(
                                    0xFF767676
                                )
                            )
                        }
                        Text(
                            text = BottomBarIcons[it].description.capitalize(Locale.ROOT) ,
                            style = TextStyle(
                                fontSize = 12.sp ,
                                fontWeight = FontWeight(400) ,
                                color = if (selectedIndex == it) Color(0xFFC9FC6E) else Color(
                                    0xFF767676
                                ) ,
                            )
                        )
                    }
                }
            }
        }
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
        //FitnessBottomBar(0)
    }
}
