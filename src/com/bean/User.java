package com.bean;

/**
 * @ClassName:用户类
 * @Description:用户模板
 * @author:ZYX
 * @date:2020/2/25
 * @Version:1.0
 * @Copyright:
 */
public class User {
    private String username; //用户名
    private String password; //密码
    private int isLogin = 0; //用户是否登录

    public int getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(int isLogin) {
        this.isLogin = isLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
