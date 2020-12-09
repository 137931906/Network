package com.cykj.bean;

public class DocInfo {

    private int id;
    private String title;
    private String userName;
    private int userId;
    private String downScore;
    private String upload;
    private String type;

    public DocInfo() {

    }

    public DocInfo(int id, String title, String userName, int userId, String downScore, String upload, String type) {
        this.id = id;
        this.title = title;
        this.userName = userName;
        this.userId = userId;
        this.downScore = downScore;
        this.upload = upload;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDownScore() {
        return downScore;
    }

    public void setDownScore(String downScore) {
        this.downScore = downScore;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
