package top.webdbw.android.easychat.model;

import top.webdbw.android.easychat.presenter.Presenter;

public interface Model<T extends Presenter> {
    T getPresenter();
}
