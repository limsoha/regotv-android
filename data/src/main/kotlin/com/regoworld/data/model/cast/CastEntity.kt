package com.regoworld.data.model.cast

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "cast")
@Parcelize
@JsonClass(generateAdapter = true)
data class CastEntity(
    @field:Json(name = "id")
    @PrimaryKey
    val id: String,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "serviceId")
    val serviceId: String,
    @field:Json(name = "status")
    val status: String
)
