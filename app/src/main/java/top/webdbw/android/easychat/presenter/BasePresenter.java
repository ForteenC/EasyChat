package top.webdbw.android.easychat.presenter;

import android.app.Activity;
import android.content.Context;

import top.webdbw.android.easychat.model.Model;

/**
 * Presenter 基类
 */
public abstract class BasePresenter<T extends Model> implements Presenter {

    protected Activity mActivity;
    protected Context mContext;
    protected T mModel;

    public BasePresenter(Activity activity) {
        mActivity = activity;
        mContext = activity;
        mModel = onCreateModel();
    }

    protected abstract T onCreateModel();

    @Override
    public T getModel() {
        return mModel;
    }

    public Context getContext() {
        return mContext;
    }

    public Activity getActivity() {
        return mActivity;
    }
}
