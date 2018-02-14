package ea2.ashif.me.trending;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import ea2.ashif.me.di.ScreenScope;

/**
 * Created by ashif on 14/02/18.
 */

@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController> {

    }
}
