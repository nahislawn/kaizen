package com.kaizenvpn.vpn.di.module

import com.limerse.iap.IapConnector
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by Furuichi on 26/09/2023
 */
@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {

    @Provides
    fun provideIapConnector(): IapConnector {
        return IapConnector()
    }
}