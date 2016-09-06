package com.threedlink.phototester;
import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
/**
 * Created by diiaz94 on 26-08-2016.
 */
public class PhotoTesterApp extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
