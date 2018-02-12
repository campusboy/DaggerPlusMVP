package campusboy.com.daggerplusmvp.presenter;

import javax.inject.Inject;

import campusboy.com.daggerplusmvp.model.User;
import campusboy.com.daggerplusmvp.view.IView;

/**
 * Created by campusboy on 18/2/12.
 */

public class UserPresenter {

    @Inject
    User user;
    @Inject
    IView view;

    @Inject
    public UserPresenter(User user, IView view) {
        this.user = user;
        this.view = view;
    }

    public void showName() {
        view.setText(user.getUserName());
    }

    public void hideName() {
        view.setText("*****");
    }

    public void changeName(String name) {
        user.setUserName(name);
    }
}
