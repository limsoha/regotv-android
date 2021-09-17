package com.regoworld.data.module

import android.content.Context
import com.regoworld.data.utils.ServiceConfig
import com.remotemonster.sdk.RemonCast
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class RemonCastModule {

    @ViewModelScoped
    @Provides
    fun provideRemonCast(@ApplicationContext context: Context): RemonCast =
        RemonCast.builder().context(context).serviceId(ServiceConfig.remoteServerKey)
            .key(ServiceConfig.secretKey)
            .build()

}