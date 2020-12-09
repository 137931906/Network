package com.cykj.bean;

public class student {

    private int id;
    private String userName;
    private int age;
    private int classId;
    private classes classes;

    public student() {

    }

    public student(int id, String userName, int age, int classId) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.classId = classId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public com.cykj.bean.classes getClasses() {
        return classes;
    }

    public void setClasses(com.cykj.bean.classes classes) {
        this.classes = classes;
    }
}
