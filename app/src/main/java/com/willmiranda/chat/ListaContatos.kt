package com.willmiranda.chat

import android.app.Application
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import com.willmiranda.chat.ui.theme.ChatTheme
import com.willmiranda.chat.viewmodel.ListaContatosViewModel

@Composable
fun ListaContatos(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()


    ){
        Column(modifier = Modifier) {
            AppBar(appBar = "Chat")

        }

        Contatos(nome = "Will", mensagem = "Bom dia")
        Contatos(nome = "Will", mensagem = "Bom dia")
        Contatos(nome = "Will", mensagem = "Bom dia")
        Contatos(nome = "Will", mensagem = "Bom dia")
        Contatos(nome = "Will", mensagem = "Bom dia")
        Contatos(nome = "Will", mensagem = "Bom dia")
    }
}

fun ListaDeContatos(){

}

@Preview(showBackground = false)
@Composable
fun ListaContatoPreview() {
    ChatTheme {
        ListaContatos()
    }
}

