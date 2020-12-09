package com.cykj.bean;

public class FindUser {

    private int Id;
    private String userName;
    private String regTime;
    private int score;
    private int uploading;
    private int download;
    private String userState;

    public FindUser() {

    }

    public FindUser(int id, String userName, String regTime, int score, int uploading, int download, String userState) {
        Id = id;
        this.userName = userName;
        this.regTime = regTime;
        this.score = score;
        this.uploading = uploading;
        this.download = download;
        this.userState = userState;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUploading() {
        return uploading;
    }

    public void setUploading(int uploading) {
        this.uploading = uploading;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
