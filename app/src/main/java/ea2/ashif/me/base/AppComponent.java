package ea2.ashif.me.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ashif on 13/02/18.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        ActivityBindingModule.class
})
public interface AppComponent {

    void inject(EffectiveApp effectiveApp);
}
