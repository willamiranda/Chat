package com.willmiranda.chat.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.willmiranda.chat.data.entity.ChatEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.Executors

@Database(entities = [ChatEntity::class], version = 1)
abstract class ChatDB : RoomDatabase() {

    abstract fun chatDao(): ChatDao

    companion object {

        @Volatile
        private var INSTANCE: ChatDB? = null

        fun getInstance(context: Context): ChatDB =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ChatDB::class.java, "Chatdb"
            )

                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        GlobalScope.launch(context = Dispatchers.IO) {
                            getInstance(context).chatDao().insertAll(PREPOPULATE_DATA)
                        }
                    }
                })
                .build()

        val PREPOPULATE_DATA = listOf(
            ChatEntity("Marina", "Ya?"),
            ChatEntity("Zamir", "HHAHAhA lol"),
            ChatEntity("Luscy", "Otw"),
            ChatEntity("Cosam", "hahaha you to"),
            ChatEntity("arlamgeons", "Whatsapp bro"),
            ChatEntity("Nunia", "Oke!")
        )
    }

}

