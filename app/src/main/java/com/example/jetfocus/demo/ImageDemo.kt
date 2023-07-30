package com.example.jetfocus.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R

// TODO("显示一个图片，没有大小，或其他修改")
@Preview
@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(R.drawable.avatar_1),
        contentDescription = null,
        modifier = Modifier
            .clickable { }
            .size(100.dp)
            .padding(10.dp)
            .clip(RoundedCornerShape(100.dp))
            .border(4.dp, Color.Green, CircleShape)
            .border(14.dp, Color.Red, CircleShape),
        contentScale = ContentScale.Crop
    )
}