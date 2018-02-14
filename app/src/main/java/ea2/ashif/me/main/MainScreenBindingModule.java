package ea2.ashif.me.main;

import com.bluelinelabs.conductor.Controller;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import ea2.ashif.me.di.ControllerKey;
import ea2.ashif.me.trending.TrendingReposComponent;
import ea2.ashif.me.trending.TrendingReposController;

/**
 * Created by ashif on 14/02/18.
 */

@Module(subcomponents = {
        TrendingReposComponent.class
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindsTrendingReposInjector(TrendingReposComponent.Builder builder);
}
