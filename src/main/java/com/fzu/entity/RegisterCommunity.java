package com.fzu.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class RegisterCommunity {
    private String id;
    private String name;
    private String pwd;
    private String introduction;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "RegisterCommunity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
