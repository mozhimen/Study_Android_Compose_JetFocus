package com.example.jetfocus.demo.event2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import graphics.ScaledDownDrawScope


@ExperimentalTextApi
fun DrawScope.drawRuler(
    textMeasurer: TextMeasurer,
    lineCount: Int = 24,
    unitsPerGroup: Int = 4,
    canvasSize: Size = Size(
        width = 240.dp.toPx(),
        height = 240.dp.toPx()
    ),
) {
    val groupCount = (lineCount / unitsPerGroup)
    val groupSize = (canvasSize.width / groupCount)
    val rulerTextCount = groupCount + 1
    val inset = (size.width - canvasSize.width)

    repeat(rulerTextCount) { i ->
        val textLayoutResult = textMeasurer.measure(
            text = "${i * unitsPerGroup}",
            style = TextStyle(fontSize = 8.sp)
        )
        drawText(
            textLayoutResult,
            topLeft = Offset(
                x = inset / 2 + groupSize * i - textLayoutResult.size.width / 2,
                y = inset / 2 - textLayoutResult.size.height
            )
        )

        drawText(
            textLayoutResult,
            topLeft = Offset(
                inset / 4 - textLayoutResult.size.height / 4,
                inset / 4 + groupSize * i + textLayoutResult.size.height / 2
            )
        )
    }
}


@ExperimentalTextApi
fun DrawScope.drawGrid(
    canvasSize: Size = Size(
        width = 240.dp.toPx(),
        height = 240.dp.toPx()
    ),
    lineCount: Int = 24
) {
    val gridSize = (canvasSize.width / lineCount)
    val inset = (size.width - canvasSize.width)

    repeat(lineCount + 1) { i ->
        // Horizontal lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = inset / 2 + gridSize * i, y = inset / 2),
            end = Offset(x = inset / 2 + gridSize * i, y = canvasSize.width + inset / 2)
        )
        // Vertical lines
        drawLine(
            color = Color.Gray,
            start = Offset(x = inset / 2, y = gridSize * i + inset / 2),
            end = Offset(x = canvasSize.width + inset / 2, y = gridSize * i + inset / 2)
        )
    }
}


@Preview(device = "spec:width=280dp,height=280dp,dpi=640")
@Preview(device = "spec:width=240dp,height=240dp,dpi=640")
@Composable
@ExperimentalTextApi
fun DrawPathDemo() {
    @OptIn(ExperimentalTextApi::class)
    val textMeasurer = rememberTextMeasurer()
    Box(
        modifier = Modifier
            .size(280.dp)
            .background(Color.White)
            .drawWithCache {
                val path = Path()
    val textMeasurer = rememberTextMeasurer()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .drawBehind {
            drawRuler(textMeasurer)
            drawGrid()
        })
}

                onDrawBehind {
                    drawRuler(textMeasurer = textMeasurer)
                    drawGrid()
                    path.moveTo(28.dp.toPx(),20.dp.toPx())
                    path.moveTo(220f.dp.toPx(),20f.dp.toPx())
                    path.moveTo(150f.dp.toPx(),120f.dp.toPx())
                    path.moveTo(215f.dp.toPx(),220f.dp.toPx())
                    path.moveTo(28.dp.toPx(),20.dp.toPx())
                }
            }
    )
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

            val path = Path()
            path.moveTo(20f.dp.toPx(), 20f.dp.toPx())
            path.lineTo(220f.dp.toPx(), 20f.dp.toPx())
            path.lineTo(150f.dp.toPx(), 120f.dp.toPx())
            path.lineTo(215f.dp.toPx(), 220f.dp.toPx())
            path.lineTo(20f.dp.toPx(), 220f.dp.toPx())
            path.lineTo(20f.dp.toPx(), 20.dp.toPx())
            path.close()

            drawPath(
                path, Color.Black, style = Stroke(width = 5.dp.toPx())
            )
        })
}
