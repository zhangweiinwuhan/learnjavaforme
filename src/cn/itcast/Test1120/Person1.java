package cn.itcast.Test1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Person1 {
/*
    需求三：
    人类Person
    属性:姓名name,年龄age,性别gender
    行为:学习study,睡觉sleep*/
    private String name;
    private String gender;
    private int age;

    public Person1(){}

    public Person1(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void study(){
        System.out.println("姓名"+name+"年龄"+age+"性别"+gender+"学习");

    }
    public void sleep(){
        System.out.println("姓名"+name+"年龄"+age+"性别"+gender+"睡觉");
    }
}
