package ea2.ashif.me.base;

import android.app.Application;

import javax.inject.Inject;

import ea2.ashif.me.di.ActivityInjector;

/**
 * Created by ashif on 13/02/18.
 */

public class EffectiveApp extends Application {

    @Inject ActivityInjector mActivityInjector;
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return mActivityInjector;
    }
}
