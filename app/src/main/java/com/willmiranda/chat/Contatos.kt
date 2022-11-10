package com.willmiranda.chat

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.willmiranda.chat.ui.theme.ChatTheme

@Composable
fun Contatos(nome: String, mensagem: String) {
    Box(

        modifier = Modifier
            .height(100.dp)
            .fillMaxSize()
            .border(BorderStroke(0.2.dp, Color.Black), CircleShape),





    ) {
        Row(modifier = Modifier.padding(top = 12.dp)
            .height(80.dp)
            .fillMaxSize()
            ) {
            Image(
                painter = painterResource(id = R.drawable.photocontato),
                contentDescription = "foto Contato",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp)
                    .padding(1.dp)
            )
            Column( modifier = Modifier
                .fillMaxSize()) {
                Text(
                    text = nome,
                    fontSize = 20.sp
                )
                Text(text = mensagem,
                    fontSize = 10.sp,

                    )
            }


        }

    }
}

@Preview
@Composable
fun ContatosPreview() {
    ChatTheme {
        Contatos("Will", "Oláasdiasjdasoidiasojdoais")
    }
}