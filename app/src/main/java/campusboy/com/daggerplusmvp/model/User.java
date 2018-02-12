package campusboy.com.daggerplusmvp.model;

import javax.inject.Inject;

/**
 * Created by campusboy on 18/2/12.
 */

public class User {
    private String userName;

    @Inject
    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
