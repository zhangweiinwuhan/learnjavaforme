package cn.itcast.Test1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("姓名："+name+"年龄："+age);
    }
}
