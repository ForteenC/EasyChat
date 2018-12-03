package top.webdbw.android.easychat;

import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePal;

/**
 * 管理数据库的单例
 */
public class ECDataBaseSingleton {

    private static SQLiteDatabase instance;

    public synchronized static SQLiteDatabase getInstance() {

        if (instance == null) {
            instance = LitePal.getDatabase();
        }

        return instance;
    }
}
