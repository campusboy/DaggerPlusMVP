package campusboy.com.daggerplusmvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import campusboy.com.daggerplusmvp.component.ActivityComponent;
import campusboy.com.daggerplusmvp.component.DaggerActivityComponent;
import campusboy.com.daggerplusmvp.module.ActivityModule;
import campusboy.com.daggerplusmvp.presenter.UserPresenter;
import campusboy.com.daggerplusmvp.view.IView;

public class MainActivity extends Activity implements IView, View.OnClickListener {

    @Inject
    UserPresenter presenter;

    private ActivityComponent activityComponent;
    private TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this, "campusboy", this))
                .build();
        activityComponent.inject(this);

        userName = findViewById(R.id.userName);
        findViewById(R.id.show).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
    }

    @Override
    public void setText(String text) {
        userName.setText(text);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.hide == id) {
            presenter.hideName();
            return;
        }

        if (R.id.show == id) {
            presenter.showName();
            return;
        }
    }
}
