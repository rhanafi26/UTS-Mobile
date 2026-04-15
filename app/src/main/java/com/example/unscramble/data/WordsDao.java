package com.example.unscramble.data;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface WordsDao {
    @Query("SELECT * FROM words")
    suspend fun getAllWords() : List<WordsModel>

    @Insert
    suspend fun insert(vararg wordsModel: WordsModel)
}
