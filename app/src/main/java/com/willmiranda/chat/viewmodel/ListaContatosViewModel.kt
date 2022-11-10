package com.willmiranda.chat.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.willmiranda.chat.data.ChatRepository
import com.willmiranda.chat.data.entity.ChatEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListaContatosViewModel(application: Application) : AndroidViewModel(application) {

    fun text() {

        viewModelScope.launch(context = Dispatchers.IO) {
            repository.getAll()

        }
    }

    private val repository = ChatRepository(application.applicationContext)

    private val listChat = MutableLiveData<List<ChatEntity>>()

    val chats: LiveData<List<ChatEntity>> = listChat

    fun get(id: Int) {
        listChat.value = listOf(repository.get(id))
    }

    fun getAll() {
        listChat.value = repository.getAll()
    }

    fun getName() {
        listChat.value = repository.getName()
    }

}