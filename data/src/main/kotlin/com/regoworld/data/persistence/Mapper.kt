package com.regoworld.data.persistence

import com.regoworld.data.model.cast.CastEntity
import com.remotemonster.sdk.data.Room

fun mapperToRoom(casts: List<CastEntity>): List<Room> {
    return casts.map {
        Room(it.id, it.name, it.serviceId, it.status)
    }
}

fun mapperToCastEntity(casts: List<Room>): List<CastEntity> {
    return casts.map {
        CastEntity(
            it.id,
            it.name,
            it.serviceId,
            it.status
        )
    }
}