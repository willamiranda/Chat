package com.willmiranda.chat.data

import androidx.room.*
import com.willmiranda.chat.data.entity.ChatEntity

@Dao
interface ChatDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(chatdb: ChatEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(chatdb: List<ChatEntity>)

    @Update
    fun update(chatdb: ChatEntity)

    @Delete
    fun delete(chatdb: ChatEntity)

    @Query("SELECT * FROM Chatdb WHERE id = :id")
    fun get(id: Int): ChatEntity

    @Query("SELECT * FROM Chatdb")
    fun getAll(): List<ChatEntity>

    @Query("SELECT * FROM Chatdb WHERE name LIKE :name ORDER BY name")
    fun getName(name: String = "%"): List<ChatEntity>
}
