package campusboy.com.daggerplusmvp.module;

import campusboy.com.daggerplusmvp.view.IView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by campusboy on 18/2/12.
 */

@Module
public class UserPresenterModule {

    private String userName;
    private IView view;

    public UserPresenterModule(String userName, IView view) {
        this.userName = userName;
        this.view = view;
    }

    @Provides
    String provideUserName() {
        return userName;
    }

    @Provides
    IView provideView() {
        return view;
    }
}
