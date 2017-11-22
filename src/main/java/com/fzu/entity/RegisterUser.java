package com.fzu.entity;

/**
 * Created by weng on 2017/11/22.
 */
public class RegisterUser {
    private String name;
    private String pwd;

    public RegisterUser() {
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
