package com.fzu.dao.entity;

/**
 * Created by weng on 2017/11/24.
 */
public class Community {
    private String communityName;
    private String communityPassword;
    private String communityCname;
    private String communityIntroduction;

    public Community(){
    }

    public String getCommunityCname() {
        return communityCname;
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

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void setCommunityCname(String communityCname) {
        this.communityCname = communityCname;
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
                "communityName='" + communityName + '\'' +
                ", communityPassword='" + communityPassword + '\'' +
                ", communityCname='" + communityCname + '\'' +
                ", communityIntroduction='" + communityIntroduction + '\'' +
                '}';
    }
}
