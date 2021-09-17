package com.regoworld.data.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.regoworld.data.model.cast.CastEntity

@Database(entities = [CastEntity::class], version = 1, exportSchema = true)
@TypeConverters(value = [TypeResponseConverter::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun castDao(): CastDao
}