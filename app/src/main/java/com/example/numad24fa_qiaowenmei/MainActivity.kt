package com.example.numad24fa_qiaowenmei

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.numad24fa_qiaowenmei.ui.theme.NUMAD24Fa_QiaowenMeiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NUMAD24Fa_QiaowenMeiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    HelloWorld()
                }
            }
        }
    }
}

@Composable
fun HelloWorld() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello World!")
        Row {
            Box {
                val context = LocalContext.current
                Button(onClick = {Toast.makeText(context,
                    "Qiaowen Mei\nmqiaowen@gmail.com",
                    Toast.LENGTH_LONG).show()}) {
                    Text("About Me")
                }
            }
        }
    }
}


@Preview
@Composable
fun HelloWorldPreview(){
    HelloWorld()
}