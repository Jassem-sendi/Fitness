package com.example.fitness.ui.screen.fitness.component
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
@Composable
fun SportCard(
    icon:Int,
    label:String
){
   Row (
       modifier = Modifier
           .padding(3.dp)
           .width(116.dp)
           .height(43.dp)
           .background(color = Color(0xFF363636), shape = RoundedCornerShape(size = 6.dp))
           .padding(start = 8.dp, end = 8.dp),
       horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
       verticalAlignment = Alignment.CenterVertically,
   ) {
       Icon(
           painter = painterResource(icon),
           contentDescription = label,
           tint = Color(0xFFFFFFFF),
           modifier = Modifier
               .padding(0.35545.dp)
               .width(17.dp)
               .height(21.33686.dp)
       )
       Text(
           text = label,
           style = TextStyle(
               fontSize = 12.sp,
               fontWeight = FontWeight(400) ,
               color = Color(0xFFFFFFFF),
               textAlign = TextAlign.Center,
           )
       )
   }
}
@Preview
@Composable
fun SportCardPreview(modifier: Modifier = Modifier){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //SportCard()
    }
}