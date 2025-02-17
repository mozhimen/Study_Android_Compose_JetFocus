package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(device = "spec:width=240dp,height=240dp,dpi=640")
@Composable
@ExperimentalTextApi
fun DrawPathDemo() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawBehind {
            drawRuler(textMeasurer)
            drawGrid()
        })
}

@Preview(device = "spec:width=240dp,height=240dp,dpi=640")
@Composable
@ExperimentalTextApi
fun DrawPathDemoResult() {
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawBehind {
            drawRuler(textMeasurer)
            drawGrid()

            val width = 240f.dp.toPx()
            val height = 240f.dp.toPx()
            val path = Path()

            //kotlin -> k
//            path.moveTo(20f.dp.toPx(), 20f.dp.toPx())
//            path.lineTo(220f.dp.toPx(), 20f.dp.toPx())
//            path.lineTo(150f.dp.toPx(), 120f.dp.toPx())
//            path.lineTo(215f.dp.toPx(), 220f.dp.toPx())
//            path.lineTo(20f.dp.toPx(), 220f.dp.toPx())
//            path.lineTo(20f.dp.toPx(), 20.dp.toPx())
//            path.close()
//
//            drawPath(
//                path, Color.Black, style = Stroke(width = 5.dp.toPx())
//            )

            //heart
            path.moveTo(width / 2, height / 3)
            path.cubicTo(width / 2, height / 7f, width / 4 * 3, height / 7f, width / 4 * 3, height / 3)
            path.quadraticBezierTo(width / 4 * 3, height / 2f, +width / 2, height / 8*5)
            path.cubicTo(width / 4, height / 2f, width / 4, height / 3, width / 4, height / 3)
            path.cubicTo(width / 4, height / 7f, width / 2, height / 7f, width / 2, height / 3)
            path.close()

            drawPath(
                path, Color.Black, style = Stroke(width = 5.dp.toPx())
            )
        })
}