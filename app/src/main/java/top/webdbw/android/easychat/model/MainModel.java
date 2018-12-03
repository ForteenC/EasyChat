package top.webdbw.android.easychat.model;

import org.litepal.LitePal;

import java.util.List;

import top.webdbw.android.easychat.model.table.SingleConversation;
import top.webdbw.android.easychat.presenter.MainPresenter;

/**
 * 主页数据请求
 */
public class MainModel extends BaseModel<MainPresenter> {

    public MainModel(MainPresenter presenter) {
        super(presenter);
    }

    public void saveSomeData() {

    }

    public List<SingleConversation> getRecyclerData() {
        List<SingleConversation> conversations = LitePal.findAll(SingleConversation.class);

        return conversations;
    }
}
