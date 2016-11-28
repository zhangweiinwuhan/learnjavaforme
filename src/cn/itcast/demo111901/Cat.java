package cn.itcast.demo111901;

/**
 * Created by Apple on 16/11/19.
 */
public class Cat extends Animal{
//    Cat 特有方法 catchMouse
    public void eat(){
        System.out.println("猫吃猫粮");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
