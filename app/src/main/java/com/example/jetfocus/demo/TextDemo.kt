package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetfocus.R

// TODO("显示一个文字，内容为Hello World")
@Preview
@Composable
fun TextDemo() {
    Text(
        text = "Hello World",
        color = Color.White,
        fontStyle = FontStyle.Italic,
        fontSize = 14.sp
    )
}