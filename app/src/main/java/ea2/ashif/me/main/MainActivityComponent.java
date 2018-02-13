package ea2.ashif.me.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ea2.ashif.me.di.ActivityScope;

/**
 * Created by ashif on 13/02/18.
 */
@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
