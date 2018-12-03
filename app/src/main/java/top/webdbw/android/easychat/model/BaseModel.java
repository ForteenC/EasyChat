package top.webdbw.android.easychat.model;

import top.webdbw.android.easychat.presenter.Presenter;

/**
 * Model 基类
 */
public abstract class BaseModel<T extends Presenter> implements Model{

    protected T mPresenter;

    public BaseModel(T presenter) {
        mPresenter = presenter;
    }

    @Override
    public T getPresenter() {
        return mPresenter;
    }

}
