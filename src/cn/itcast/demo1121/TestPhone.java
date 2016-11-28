package cn.itcast.demo1121;

/**
 * Created by Apple on 16/11/21.
 */
public class TestPhone {
    public static void main(String[] args) {
        new OldPhone(){}.call();
        new OldPhone(){}.sendmMessage();
        new NewPhone(){}.call();
        new NewPhone(){}.sendmMessage();
        new NewPhone(){}.PlayGame();
//        用匿名内部类的方式调用玩游戏的功能.
        new PlayGame(){
            public void PlayGame(){
                System.out.println("玩游戏机");
            }
        }.PlayGame();
    }
}
