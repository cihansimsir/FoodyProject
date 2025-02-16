package com.foody;

import android.app.Application;

import com.facebook.react.ReactApplication;

import com.oblador.vectoricons.VectorIconsPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;


import com.oblador.vectoricons.VectorIconsPackage;
import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
private static CallbackManager mCallbackManager = CallbackManager.Factory.create();

protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
}
@Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    AppEventsLogger.activateApp(this);
  }
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    protected List<ReactPackage> getPackages() {
   
return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new VectorIconsPackage(),
            new ReactNativeLocalizationPackage(),
            new LinearGradientPackage(),
            new RNGestureHandlerPackage(),
      new FBSDKPackage(mCallbackManager)
      );


 }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  
@Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }



}
