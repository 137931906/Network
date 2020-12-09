package com.cykj.bean;


public class User {

    private int userId;
    private String userName;
    private String account;
    private String pwd;
    private String sex;
    private String education;
    private String profession;
    private int phone;
    private String email;

    public User() {

    }

    public User(int userId, String userName, String account, String pwd, String sex, String education, String profession, int phone, String email) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
        this.pwd = pwd;
        this.sex = sex;
        this.education = education;
        this.profession = profession;
        this.phone = phone;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
