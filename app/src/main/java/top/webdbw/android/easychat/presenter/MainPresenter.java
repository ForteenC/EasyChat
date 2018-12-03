package top.webdbw.android.easychat.presenter;

import android.app.Activity;

import java.util.List;

import top.webdbw.android.easychat.model.MainModel;
import top.webdbw.android.easychat.model.table.SingleConversation;

public class MainPresenter extends BasePresenter<MainModel> {

    public MainPresenter(Activity activity) {
        super(activity);
    }

    @Override
    protected MainModel onCreateModel() {
        return new MainModel(this);
    }

    public List<SingleConversation> getRecyclerData() {
        return getModel().getRecyclerData();
    }

    public void saveSomeData() {
        getModel().saveSomeData();
    }

}