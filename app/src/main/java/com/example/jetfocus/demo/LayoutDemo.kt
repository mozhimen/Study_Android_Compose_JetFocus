package com.example.jetfocus.demo

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetfocus.R

/**
 * @ClassName LayoutDemo
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/7/16 15:35
 * @Version 1.0
 */
@Preview
@Composable
fun LayoutDemo() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                contentDescription = null,
                painter = painterResource(id = R.drawable.avatar_1),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Andy", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
        Column(modifier = Modifier.padding(vertical = 12.dp)) {
            Text(text = "Android Developer")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Andy 是相当有经验的安卓开发者，他参与了Google的各类大型项目，他喜欢游泳和烘培。")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
fun Preview() {
    Column {
        repeat(4) {
            LayoutDemo()
        }
    }
}