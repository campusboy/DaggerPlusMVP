package campusboy.com.daggerplusmvp.component;

import campusboy.com.daggerplusmvp.MainActivity;
import campusboy.com.daggerplusmvp.module.ActivityModule;
import dagger.Component;

/**
 * Created by campusboy on 18/2/12.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
