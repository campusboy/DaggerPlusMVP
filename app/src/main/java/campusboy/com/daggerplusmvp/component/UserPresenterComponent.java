package campusboy.com.daggerplusmvp.component;

import campusboy.com.daggerplusmvp.MainActivity;
import campusboy.com.daggerplusmvp.annotations.UserPresenterContainer;
import campusboy.com.daggerplusmvp.module.UserPresenterModule;
import dagger.Component;

/**
 * Created by campusboy on 18/2/12.
 */

@Component(modules = UserPresenterModule.class)
public interface UserPresenterComponent {
    void inject(@UserPresenterContainer MainActivity mainActivity);
}
