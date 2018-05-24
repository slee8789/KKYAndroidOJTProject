package com.geunyoung.kkyandroidojtproject;

import android.app.Application;
import android.widget.Toast;

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"MyApplication onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Toast.makeText(this,"MyApplication onTerminate",Toast.LENGTH_SHORT).show();
    }
}
