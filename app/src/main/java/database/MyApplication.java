package database;

import android.app.Application;

/**
 * Created by E5 on 2016/7/14.
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }


}

