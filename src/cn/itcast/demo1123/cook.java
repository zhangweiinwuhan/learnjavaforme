package cn.itcast.demo1123;

/**
 * Created by Apple on 16/11/24.
 */
public class cook extends employee implements VIP {
    public cook(){
        super();
    }
    public cook(String name,String number){
        super(name,number);
    }

    public void work(){
        System.out.println("遇到新东方厨师就嫁了吧！");

    }
    public void server(){
        System.out.println("肚子饿吗？下面给你吃啊！！！");
    }
}
