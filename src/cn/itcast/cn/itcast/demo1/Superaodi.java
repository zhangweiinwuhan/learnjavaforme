package cn.itcast.cn.itcast.demo1;

/**
 * Created by Apple on 16/11/19.
 */
public class Superaodi extends Car implements CarFunction{
    public void run(){
//        高端的奥迪车除了具有跑的功能外，还具有自动泊车和无人驾驶的功能！
        System.out.println("高端奥迪飙车王");
    }
    public void zidongpoche(){
        System.out.println("自动park");
    }
    public void wurenjiashi(){
        System.out.println("无人驾驶");
    }
}
