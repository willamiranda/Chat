package com.willmiranda.chat

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.willmiranda.chat.ui.theme.ChatTheme

@Composable
fun AppBar() {
    Box(modifier = Modifier
        .height(80.dp)
        .fillMaxSize()){
        Image(painter = painterResource(id = R.color.white),
            contentDescription = "background app bar search")
        
        TopAppBar (modifier = Modifier.padding(top = 24.dp),
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            title = {
                Text(
                text = "TopAppBarChat",
                color = Color.White
                )
            },
        )

    }
}
@Preview
@Composable
fun AppBarPreview(){
    AppBar()
}
