package com.example.ryadar.android_data_binding;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //MultiDex.install(this);
    }
}
