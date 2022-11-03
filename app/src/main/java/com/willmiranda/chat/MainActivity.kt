package com.willmiranda.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.willmiranda.chat.ui.theme.ChatTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
         val chat = "Chat"
        super.onCreate(savedInstanceState)

        setContent {
            ChatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(80.dp),
                    color = MaterialTheme.colors.background
                ) {
                    AppBar(appBar = chat)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")

}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    ChatTheme {
        AppBar(appBar = "chat")
    }
}