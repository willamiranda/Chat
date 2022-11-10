package com.willmiranda.chat.data

import android.content.Context
import com.willmiranda.chat.data.entity.ChatEntity

class ChatRepository(context: Context) {
    private val chatDB = ChatDB.getInstance(context).chatDao()

    fun insert(chatdb: ChatEntity) {
        return chatDB.insert(chatdb)
    }


    fun insertAll(chatdb: List<ChatEntity>) {
        return chatDB.insertAll(chatdb)
    }


    fun update(chatdb: ChatEntity) {
        return chatDB.update(chatdb)
    }


    fun delete(id: Int) {
        return delete(id)
    }


    fun get(id: Int): ChatEntity {
        return chatDB.get(id)
    }


    fun getAll(): List<ChatEntity> {
        return chatDB.getAll()
    }


    fun getName(name: String = "%"): List<ChatEntity> {
        return chatDB.getName(name)
    }

}
