package com.willmiranda.chat



import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.willmiranda.chat.ui.theme.ChatTheme


@Composable
fun AppBar(appBar :String) {
    Column(modifier = Modifier
        .height(150.dp)
        .fillMaxSize()
        ){

        
        TopAppBar (modifier = Modifier.padding(top = 12.dp),
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            actions = {
                Image(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "app bar search"
            )

            },
            title = {
                    Row(horizontalArrangement  =  Arrangement.SpaceBetween) {
                        Text(
                            text = appBar,
                            color = Color.Black
                        )
                       // Spacer(Modifier.weight(1f))

                    }
            },
        )

    }
}
@Preview
@Composable
fun AppBarPreview(){
    ChatTheme {
   AppBar("Search")
}}
