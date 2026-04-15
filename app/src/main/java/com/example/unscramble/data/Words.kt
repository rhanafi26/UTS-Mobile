package com.example.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "items")
data class Words (
    @PrimaryKey(autoGenerate = true)
    @field:SerializedName(value="index")
    val index : Int = 0,

    @field:SerializedName(value="word")
    val word : String = "",
)

