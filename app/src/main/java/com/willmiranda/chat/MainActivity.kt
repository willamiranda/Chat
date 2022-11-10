package com.willmiranda.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
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
import androidx.lifecycle.ViewModel
import com.willmiranda.chat.ui.theme.ChatTheme
import com.willmiranda.chat.viewmodel.ListaContatosViewModel

class MainActivity : ComponentActivity() {

    val viewModel: ListaContatosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

       viewModel.text()

        super.onCreate(savedInstanceState)
        val chat = "Chat"
        setContent {
            ChatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ListaContatos()
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

    }
}

