package top.webdbw.android.easychat.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import top.webdbw.android.easychat.R;
import top.webdbw.android.easychat.presenter.MainPresenter;

/**
 * 主页
 */
public class MainActivity extends BaseActivity<MainPresenter> {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mPresenter.saveSomeData();

        mRecyclerView = findViewById(R.id.main_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new ECRecyclerViewAdapter(this, mPresenter.getRecyclerData()));
    }

    @Override
    protected MainPresenter onCreatePresenter() {
        return new MainPresenter(this);
    }
}
