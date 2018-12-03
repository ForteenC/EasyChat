package top.webdbw.android.easychat.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import top.webdbw.android.easychat.presenter.Presenter;

/**
 * Activity 基类
 */
public abstract class BaseActivity<T extends Presenter> extends AppCompatActivity {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = onCreatePresenter();
    }

    //presenter必须初始化
    protected abstract T onCreatePresenter();
}
