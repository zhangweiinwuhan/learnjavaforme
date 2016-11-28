package cn.itcast.Test1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Animal {

/*    需求二：
    动物类Animal
    属性:姓名name,年龄age
    行为:吃饭eat，睡觉sleep*/
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void eat(){
        System.out.println("姓名"+name+"年龄"+age+"吃饭");
    }
    public void sleep(){
        System.out.println("姓名"+name+"年龄"+age+"睡觉");
    }
}
