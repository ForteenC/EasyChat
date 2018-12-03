package top.webdbw.android.easychat.model.table;

import org.litepal.crud.LitePalSupport;

import java.util.List;

/**
 * 用户
 */
public class User extends LitePalSupport {

    private String name;                            //昵称

    private Image avator;                           //头像

    private List<SingleConversation> conversations; //对话

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Image getAvator() {
        return avator;
    }
    public void setAvator(Image avator) {
        this.avator = avator;
    }
    public List<SingleConversation> getConversations() {
        return conversations;
    }
    public void setConversations(List<SingleConversation> conversations) {
        this.conversations = conversations;
    }
}
