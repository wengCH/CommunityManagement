package com.fzu.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class LoginCommunity {
    private String id;
    private String pwd;

    public LoginCommunity() {
    }

    public String getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "LoginCommunity{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
