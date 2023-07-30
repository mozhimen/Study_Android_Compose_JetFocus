package com.example.jetfocus.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetfocus.ui.theme.TaskTheme
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * @ClassName DemoTime
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/7/16 17:14
 * @Version 1.0
 */

class DemoTime {
    @Preview
    @Composable
    fun Preview() {
        TaskTheme {
            Surface {
                Timer()
            }
        }
    }

    @SuppressLint("SimpleDateFormat")
    @Composable
    fun Timer() {
        val time: Long by remember { mutableStateOf(1440000L) }
        val state: Int by remember {
            mutableStateOf(0)
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
            ) {
                Text(text = SimpleDateFormat("mm:ss").format(Date(time)), modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 24.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    if (state==0){
                    }
                }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text = "Start")
                }
            }
        }
    }
}