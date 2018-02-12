package campusboy.com.daggerplusmvp.module;

import android.app.Activity;
import android.content.Context;

import campusboy.com.daggerplusmvp.view.IView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by campusboy on 18/2/12.
 */

@Module
public class ActivityModule {

    private Activity activity;
    private String userName;
    private IView view;

    public ActivityModule(Activity activity, String userName, IView view) {
        this.activity = activity;
        this.userName = userName;
        this.view = view;
    }

    @Provides
    Context provideContext() {
        return activity;
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
