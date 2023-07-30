package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mozhimen.basick.utilk.kotlin.math.UtilKTriangle

/**
 * @ClassName DrawClock
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/7/30 15:58
 * @Version 1.0
 */
@Preview
@Composable
fun DrawClock(minute: Int) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val radius = 120.dp.toPx()
        val scaleLength = 10f.dp.toPx()
        val innerRadius = radius - scaleLength
        drawCircle(Color.Black, radius = radius)
        (0 until 60).forEach {
            val angle = it * 6f
            val start1X = UtilKTriangle.getOppositeLength(innerRadius, angle)
            val start1Y = UtilKTriangle.getAdjacentLength(innerRadius, angle)
            val start2X = UtilKTriangle.getOppositeLength(radius, angle)
            val start2Y = UtilKTriangle.getAdjacentLength(radius, angle)
            val startOffset = Offset(start1X, start1Y)
            val endOffset = Offset(start2X, start2Y)
            drawLine(Color.White, startOffset, endOffset, strokeWidth = 2f.dp.toPx())
        }
    }
}