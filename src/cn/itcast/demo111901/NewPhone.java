package cn.itcast.demo111901;

/**
 * Created by Apple on 16/11/19.
 */
public class NewPhone extends Phone implements IPlay {
//    已知接口IPlay中有一个方法 playGame()，NewPhone添加玩游戏的功能;
    public void call(){
        System.out.println("新手机打电话");
    }
    public void sendMessage(){
        System.out.println("新手机发短信");
    }
    public void playGame(){
        System.out.println("新手机打游戏");
    }
}
