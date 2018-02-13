package ea2.ashif.me.base;

import android.app.Application;

/**
 * Created by ashif on 13/02/18.
 */

public class EffectiveApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
