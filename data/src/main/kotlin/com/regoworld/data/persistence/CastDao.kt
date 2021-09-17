package com.regoworld.data.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.regoworld.data.model.cast.CastEntity
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface CastDao {

    @Insert(onConflict = REPLACE)
    fun insertCasts(casts: List<CastEntity>): Completable

    @Query("SELECT * FROM cast")
    fun getAllCasts(): Single<List<CastEntity>>
}