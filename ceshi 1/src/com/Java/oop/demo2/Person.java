package com.Java.oop.demo2;

public class Person {
    //自带构造器
    String name;
    //实例化初始值
    //无参构造
    public Person() {
        this.name = "你好";
    }
    //有参构造
    public Person(String name){
            this.name=name;
        }

}
   /*public static void main(String[] args) {
        //new 实例化了一个对象
        Person person = new Person("哈哈哈");
        System.out.println(person.name);
    }*/