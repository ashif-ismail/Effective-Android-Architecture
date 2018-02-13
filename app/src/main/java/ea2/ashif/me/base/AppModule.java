package ea2.ashif.me.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ashif on 13/02/18.
 */

@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    public Context providesApplicationContext() {
        return mApplication;
    }
}
