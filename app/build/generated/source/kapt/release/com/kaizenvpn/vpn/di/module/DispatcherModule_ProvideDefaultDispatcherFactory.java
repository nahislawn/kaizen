// Generated by Dagger (https://dagger.dev).
package com.kaizenvpn.vpn.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.kaizenvpn.vpn.di.qualifier.DefaultDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DispatcherModule_ProvideDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final DispatcherModule module;

  public DispatcherModule_ProvideDefaultDispatcherFactory(DispatcherModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideDefaultDispatcher(module);
  }

  public static DispatcherModule_ProvideDefaultDispatcherFactory create(DispatcherModule module) {
    return new DispatcherModule_ProvideDefaultDispatcherFactory(module);
  }

  public static CoroutineDispatcher provideDefaultDispatcher(DispatcherModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDefaultDispatcher());
  }
}
