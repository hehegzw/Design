package gzw.cn.design.login.model;

/**
 * Created by gzw on 2016/5/16.
 */
public class UserInfo {
    public String username;
    public String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
