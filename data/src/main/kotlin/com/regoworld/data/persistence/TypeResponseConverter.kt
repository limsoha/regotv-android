package com.regoworld.data.persistence

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.remotemonster.sdk.data.Room
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import javax.inject.Inject

@ProvidedTypeConverter
class TypeResponseConverter @Inject constructor(
    private val moshi: Moshi
) {

    @TypeConverter
    fun fromString(value: String): List<Room>? {
        val listType = Types.newParameterizedType(List::class.java, Room::class.java)
        val adapter: JsonAdapter<List<Room>> = moshi.adapter(listType)
        return adapter.fromJson(value)
    }

    @TypeConverter
    fun fromRoomType(type: List<Room>?): String {
        val listType = Types.newParameterizedType(List::class.java, Room::class.java)
        val adapter: JsonAdapter<List<Room>> = moshi.adapter(listType)
        return adapter.toJson(type)
    }
}