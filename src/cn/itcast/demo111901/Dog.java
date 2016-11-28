package cn.itcast.demo111901;

/**
 * Created by Apple on 16/11/19.
 */
public class Dog extends Animal{
//    定义子类 Dog  特有方法keepHome
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
