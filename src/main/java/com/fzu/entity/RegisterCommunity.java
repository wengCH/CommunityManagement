package com.fzu.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class RegisterCommunity {
    private String name;
    private String pwd;
    private String cname;
    private String introduction;

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getCname() {
        return cname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "RegisterCommunity{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", cname='" + cname + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
