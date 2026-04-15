package com.example.unscramble.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Words::class], version = 2)
abstract class AppDatabases {
    abstract fun WordsDao() : WordsDao

    companion object {
        @Volatile
        var INSTANCE: AppDatabases? = null

        fun getDatabase(applicationContext : Context) : AppDatabases {
            return INSTANCE ?: Room.databaseBuilder(
                applicationContext,
                AppDatabases::class.java, "words_database"
            )
//                .fallbackToDestructiveMigration()
                .build()
                .also { INSTANCE = it }

        }
    }
}