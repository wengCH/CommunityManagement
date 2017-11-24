package com.fzu.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class LoginCommunity {
    private String name;
    private String pwd;

    public LoginCommunity() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "LoginCommunity{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
