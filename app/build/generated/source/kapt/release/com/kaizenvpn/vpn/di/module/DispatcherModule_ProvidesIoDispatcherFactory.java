// Generated by Dagger (https://dagger.dev).
package com.kaizenvpn.vpn.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class DispatcherModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final DispatcherModule module;

  public DispatcherModule_ProvidesIoDispatcherFactory(DispatcherModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return providesIoDispatcher(module);
  }

  public static DispatcherModule_ProvidesIoDispatcherFactory create(DispatcherModule module) {
    return new DispatcherModule_ProvidesIoDispatcherFactory(module);
  }

  public static CoroutineDispatcher providesIoDispatcher(DispatcherModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesIoDispatcher());
  }
}
