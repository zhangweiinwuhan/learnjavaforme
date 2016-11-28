package cn.itcast.demo111901;

/**
 * Created by Apple on 16/11/19.
 */
public class TestPhone {

//    要求: 分别测试OldPhone和NewPhone的两个方法,再测试新手机palyGame()的方法.
    public static void main(String[] args) {
        Phone p=new OldPhone();
        NewPhone p2=new NewPhone();
        p.call();
        p.sendMessage();
        p2.call();
        p2.sendMessage();
        p2.playGame();
    }
}
