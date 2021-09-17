package com.Java.oop.deemo1;

public class man {
    //属性私有
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private char sex;

    //提供一些可以操作这个属性的方法
    //提供一些public的get或set的方法

    //get 获得这个数据
    public String getName() {
        return this.name;
    }
    //set 给这个数据赋值
    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
