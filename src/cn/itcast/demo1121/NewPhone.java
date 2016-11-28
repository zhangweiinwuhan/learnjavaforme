package cn.itcast.demo1121;

/**
 * Created by Apple on 16/11/21.
 */
public class NewPhone extends Phone implements PlayGame{
//    其中NewPhone想添加一个玩游戏的功能.
    public void call(){
        System.out.println("新手机打电话");
    }

    @Override
    public void sendmMessage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void PlayGame() {
        System.out.println("玩游戏");
    }
}
