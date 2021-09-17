package com.regoworld.presentation.module

import android.app.Application
import androidx.room.Room
import com.regoworld.data.persistence.AppDatabase
import com.regoworld.data.persistence.CastDao
import com.regoworld.data.persistence.TypeResponseConverter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application,
        typeResponseConverter: TypeResponseConverter
    ): AppDatabase {
        return Room
            .databaseBuilder(application, AppDatabase::class.java, "RegoTV.db")
            .fallbackToDestructiveMigration()
            .addTypeConverter(typeResponseConverter)
            .build()
    }

    @Provides
    @Singleton
    fun provideCastDao(appDatabase: AppDatabase): CastDao {
        return appDatabase.castDao()
    }

    @Provides
    @Singleton
    fun provideTypeResponseConverter(moshi: Moshi): TypeResponseConverter {
        return TypeResponseConverter(moshi)
    }
}