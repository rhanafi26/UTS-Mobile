package com.example.unscramble.ui.theme
import androidx.room.Entity

@Entity(tableName = "items")
data class Words (val allWords: Words){
}

