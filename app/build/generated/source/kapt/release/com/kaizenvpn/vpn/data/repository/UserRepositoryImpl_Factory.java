// Generated by Dagger (https://dagger.dev).
package com.kaizenvpn.vpn.data.repository;

import com.kaizenvpn.vpn.data.remote.FirebaseService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.kaizenvpn.vpn.di.qualifier.IoDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UserRepositoryImpl_Factory implements Factory<UserRepositoryImpl> {
  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<FirebaseService> firebaseServiceProvider;

  public UserRepositoryImpl_Factory(Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<FirebaseService> firebaseServiceProvider) {
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.firebaseServiceProvider = firebaseServiceProvider;
  }

  @Override
  public UserRepositoryImpl get() {
    return newInstance(ioDispatcherProvider.get(), firebaseServiceProvider.get());
  }

  public static UserRepositoryImpl_Factory create(
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<FirebaseService> firebaseServiceProvider) {
    return new UserRepositoryImpl_Factory(ioDispatcherProvider, firebaseServiceProvider);
  }

  public static UserRepositoryImpl newInstance(CoroutineDispatcher ioDispatcher,
      FirebaseService firebaseService) {
    return new UserRepositoryImpl(ioDispatcher, firebaseService);
  }
}
