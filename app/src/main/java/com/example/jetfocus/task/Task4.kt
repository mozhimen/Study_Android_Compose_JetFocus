package com.example.jetfocus.task

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.jetfocus.R

// Modifiers。
class Task4 {
    // TODO(调整各个视图的大小，对齐，左右上下空间使界面更加整齐，然后把图片改成圆角。)
    @Composable
    fun UserInfoCard() {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape),
                    painter = painterResource(R.drawable.andy),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Andy Holloway")
            }
            Column {
                Text("Android Developer")
                Spacer(modifier = Modifier.height(10.dp))
                Text("Andy 是相当有经验的安卓开发者，他参与了Google的各类大型项目，他喜欢游泳和烘培。")
            }
        }
    }

    @Composable
    @Preview
    fun Preview() {
        UserInfoCard()
    }
}


