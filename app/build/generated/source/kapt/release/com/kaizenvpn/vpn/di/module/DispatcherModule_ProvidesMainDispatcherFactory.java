// Generated by Dagger (https://dagger.dev).
package com.kaizenvpn.vpn.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.kaizenvpn.vpn.di.qualifier.MainDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DispatcherModule_ProvidesMainDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final DispatcherModule module;

  public DispatcherModule_ProvidesMainDispatcherFactory(DispatcherModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return providesMainDispatcher(module);
  }

  public static DispatcherModule_ProvidesMainDispatcherFactory create(DispatcherModule module) {
    return new DispatcherModule_ProvidesMainDispatcherFactory(module);
  }

  public static CoroutineDispatcher providesMainDispatcher(DispatcherModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesMainDispatcher());
  }
}