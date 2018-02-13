package ea2.ashif.me.di;

import android.app.Activity;

import ea2.ashif.me.base.BaseActivity;

/**
 * Created by ashif on 13/02/18.
 */

public class Injector {

    public Injector() {
    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
