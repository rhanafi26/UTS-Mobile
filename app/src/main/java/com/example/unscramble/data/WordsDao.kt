package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordsDao {

    @Query("SELECT * FROM items")
    suspend fun getAllWords() : List<WordsModel>

    @Insert
    suspend fun insert(vararg wordsModel: WordsModel)
}