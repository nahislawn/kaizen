package com.kaizenvpn.vpn.data.repository

import com.kaizenvpn.vpn.data.model.Config
import com.kaizenvpn.vpn.data.remote.FirebaseService
import com.kaizenvpn.vpn.di.qualifier.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.*
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Furuichi on 25/09/2023
 */
interface CommonRepository {

    val configState: StateFlow<Config?>
    fun getConfigs(): Flow<Config>
}

class CommonRepositoryImpl @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val firebaseService: FirebaseService
) : CommonRepository {
    private val _configState = MutableStateFlow<Config?>(null)
    override val configState: StateFlow<Config?>
        get() = _configState

    override fun getConfigs(): Flow<Config> {
        return flow {
            val config = firebaseService.getConfig()
            _configState.emit(config)
            Timber.d("#getConfigs: $config")
            emit(config)
        }.flowOn(ioDispatcher)
    }

}