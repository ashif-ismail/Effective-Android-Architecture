package ea2.ashif.me.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

import javax.inject.Inject;

import ea2.ashif.me.di.Injector;
import ea2.ashif.me.di.ScreenInjector;

/**
 * Created by ashif on 13/02/18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    ScreenInjector screenInjector;
    private static String KEY_INSTANCE_ID = "instance_id";
    private String instanceId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            instanceId = savedInstanceState.getString(KEY_INSTANCE_ID);
        } else {
             instanceId = UUID.randomUUID().toString();
        }

        Injector.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_INSTANCE_ID,instanceId);
    }

    public String getInstanceId() {
        return instanceId;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Injector.clearComponent(this);
        }
    }

    public ScreenInjector getScreenInjector() {
        return screenInjector;
    }
}
