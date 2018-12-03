package top.webdbw.android.easychat.presenter;

import top.webdbw.android.easychat.model.Model;

public interface Presenter<T extends Model> {
    T getModel();
}
