package com.example.jetfocus.task

import android.content.res.Configuration
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
import com.example.jetfocus.R

/*显示大量数据*/
class Task6 {
    // TODO(多次复制UserCardInfo放在Colum布局里面创建一个纵向列表)
    // TODO(用repeat函数重复UserInfoCard并观察列表的滚动)

    @Composable
    fun UI() {
        Column {
            UserInfoCard()
            UserInfoCard()
            UserInfoCard()
            repeat(4) {
                UserInfoCard()
            }
        }
    }

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
            Column(modifier = Modifier.padding(vertical = 12.dp)) {
                Text("Android Developer")
                Spacer(modifier = Modifier.height(10.dp))
                Text("Andy 是相当有经验的安卓开发者，他参与了Google的各类大型项目，他喜欢游泳和烘培。")
            }
        }
    }

    @Composable
    @Preview(name = "Light Mode")
    @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Mode")
    fun Preview() {
        UI()
    }
}