package com.fzu.dao.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class Community {
    private String communityId;
    private String communityName;
    private String communityPassword;
    private String communityIntroduction;

    public Community(){
    }

    public String getCommunityId() {
        return communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public String getCommunityPassword() {
        return communityPassword;
    }

    public String getCommunityIntroduction() {
        return communityIntroduction;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void setCommunityPassword(String communityPassword) {
        this.communityPassword = communityPassword;
    }

    public void setCommunityIntroduction(String communityIntroduction) {
        this.communityIntroduction = communityIntroduction;
    }

    @Override
    public String toString() {
        return "Community{" +
                "communityId='" + communityId + '\'' +
                ", communityName='" + communityName + '\'' +
                ", communityPassword='" + communityPassword + '\'' +
                ", communityIntroduction='" + communityIntroduction + '\'' +
                '}';
    }
}
