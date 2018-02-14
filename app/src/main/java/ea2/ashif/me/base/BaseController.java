package ea2.ashif.me.base;

import android.content.Context;
import android.support.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;

import ea2.ashif.me.di.Injector;

/**
 * Created by ashif on 14/02/18.
 */

public abstract class BaseController extends Controller {

    private boolean isInjected = false;

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        // Controller instances are retained across configuration changes
        if (!isInjected) {
            Injector.inject(this);
            isInjected = true;
        }
        super.onContextAvailable(context);
    }
}
