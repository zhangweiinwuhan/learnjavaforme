package cn.itcast.demo1121;

/**
 * Created by Apple on 16/11/21.
 */
public class OldPhone extends Phone {
//    两个子类OldPhone 和 NewPhone
    public void call(){
        System.out.println("打电话");
    }
    @Override
    public void sendmMessage() {
        System.out.println("发短信");
    }
}
