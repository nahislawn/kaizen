// Generated by Dagger (https://dagger.dev).
package com.kaizenvpn.vpn.data.remote;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FirebaseService_Factory implements Factory<FirebaseService> {
  private final Provider<Context> contextProvider;

  public FirebaseService_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FirebaseService get() {
    return newInstance(contextProvider.get());
  }

  public static FirebaseService_Factory create(Provider<Context> contextProvider) {
    return new FirebaseService_Factory(contextProvider);
  }

  public static FirebaseService newInstance(Context context) {
    return new FirebaseService(context);
  }
}
