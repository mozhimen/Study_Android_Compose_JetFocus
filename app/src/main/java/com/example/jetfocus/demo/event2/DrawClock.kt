package com.example.jetfocus.demo.event2

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

/**
 * @ClassName DrawClock
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/7/30 15:58
 * @Version 1.0
 */
@Preview
@Composable
fun ProgressCircle(sweepAngle: Double = 310.0) {
    // Circle diameter
    val size = 160.dp
    Box(contentAlignment = Alignment.Center) {
        Canvas(
            modifier = Modifier.size(size)
        ) {
            val radius = size.toPx() / 2
            val stokeWidth = 12.dp.toPx()


            ////////////
            //划刻度
            drawCircle(
                color = Color(0xFF4785EF),
                style = Stroke(
                    width = stokeWidth,
                    pathEffect = PathEffect.dashPathEffect(
                        intervals = floatArrayOf(0.1.dp.toPx(), 20.dp.toPx())
                    ),
                    cap = StrokeCap.Round
                ))
            ////////////
            //画mask
            drawArc(
                brush = Brush.sweepGradient(0f to Color.White, 1f to Color.White),
//                brush = Brush.sweepGradient(
//                    0f to Color.Magenta,
//                    0.5f to Color.Blue,
//                    0.75f to Color.Green,
//                    0.75f to Color.Transparent,
//                    1f to Color.Magenta
//                ),
                startAngle = -90f,
                sweepAngle = sweepAngle.toFloat(),
                useCenter = false,
                style = Stroke(
                    width = stokeWidth
                ),
                alpha = 0.5f
            )
//            ////////////
            //画指针
            val angle = (360.0 - sweepAngle) / 180.0 * Math.PI
            val pointTailLength = 8.dp.toPx()
            drawLine(
                color = Color(0xFF4785EF),
                start = Offset(radius + pointTailLength * sin(angle).toFloat(), radius + pointTailLength * cos(angle).toFloat()),
                end = Offset((radius - radius * sin(angle) - sin(angle) * stokeWidth / 2).toFloat(), (radius - radius * cos(angle) - cos(angle) * stokeWidth / 2).toFloat()),
                strokeWidth = 2.dp.toPx()
            )
            drawCircle(
                color = Color(0xFF4785EF),
                radius = 3.dp.toPx()
            )
        }
    }
}
