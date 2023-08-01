package com.example.jetfocus.task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.demo.event2.drawGrid
import com.example.jetfocus.demo.event2.drawRuler

@OptIn(ExperimentalTextApi::class)
@Preview
@Composable
fun CurveTask() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawWithCache {
            val path = Path()
            onDrawBehind {
                drawRuler(textMeasurer)
                drawGrid()

                path.moveTo(4.5.dp.toPx(),18.5.dp.toPx())
                path.lineTo(1.5.dp.toPx(),-10.dp.toPx())
                path.cubicTo(1.0.dp.toPx(),-7.dp.toPx(),12.dp.toPx(),-7.dp.toPx(),13.dp.toPx(),0.dp.toPx())
                path.lineTo(1.5.dp.toPx(),10.dp.toPx())
                path.moveTo(12.dp.toPx(),0.dp.toPx())
                path.cubicTo(-2.dp.toPx(),4.dp.toPx(),-6.dp.toPx(),4.dp.toPx(),-8.dp.toPx(),0.dp.toPx())
                path.close()

                drawPath(
                    path, Color.Black, style = Stroke(width = 5.dp.toPx())
                )
            }
        })
}