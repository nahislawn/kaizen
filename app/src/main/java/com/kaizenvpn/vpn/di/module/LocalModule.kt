package com.kaizenvpn.vpn.di.module

import com.kaizenvpn.vpn.data.preferences.DataStoreManager
import com.kaizenvpn.vpn.data.preferences.DataStoreManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Furuichi on 07/09/2023
 */
@InstallIn(SingletonComponent::class)
@Module
object LocalModule {
    @Singleton
    @Provides
    fun provideDataStoreManager(dataStoreManagerImpl: DataStoreManagerImpl): DataStoreManager {
        return dataStoreManagerImpl
    }

}