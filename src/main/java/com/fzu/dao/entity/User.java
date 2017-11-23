package com.fzu.dao.entity;

/**
 * Created by weng on 2017/11/19.
 */
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private  String userRelname;
    private String userSex;
    private String userMajor;
    private  String userPhone;
    private String userEmail;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public String getUserRelname() {
        return userRelname;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserRelname(String userRelname) {
        this.userRelname = userRelname;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRelname='" + userRelname + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userMajor='" + userMajor + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
