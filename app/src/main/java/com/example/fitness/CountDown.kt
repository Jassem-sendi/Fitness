package com.example.fitness

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.runtime.remember
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("InvalidColorHexValue")
@Composable
fun Countdown() {
    var targetProgress by remember { mutableStateOf(1f) }
    var targetCount by remember { mutableStateOf(3) }
    val progress by animateFloatAsState(
        targetValue = targetProgress,
        animationSpec = tween(
            durationMillis = 1000,
            easing = LinearEasing
        )
    )
    val animatedCount by animateIntAsState(
        targetValue = targetCount,
        animationSpec = tween(
            durationMillis = 300,
            easing = LinearEasing
        )
    )
    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = Unit) {
        scope.launch {
            for (i in 3 downTo 0) {
                targetCount = i
                targetProgress = i / 3f
                delay(1000L)
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = progress,
            modifier = Modifier
                .size(390.dp)
                .padding(16.dp),
            color = Color(0xFFC9FC6E),
            strokeWidth = 10.dp,
            trackColor = Color(0xFF40551F)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "$animatedCount",
            fontSize = 100.sp,
            color = Color.White
        )
    }
}
@Preview(device = "id:pixel_8_pro")
@Composable
fun CountdownScreenPreview() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Countdown()
    }
}
