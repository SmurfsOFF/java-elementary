package com.company.lesson6;

public class User {
    String name;
    int age;

    public User(){

    }

    public User(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName();
    }
}
