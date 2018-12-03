package top.webdbw.android.easychat.model.table;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * 单独对话
 */
public class SingleConversation extends LitePalSupport {

    @Column(unique = true)
    private long time;                  //时间戳

    private String text;                //文字

    private User user;             //消息的发出者

    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
