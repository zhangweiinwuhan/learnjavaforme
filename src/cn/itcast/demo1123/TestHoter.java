package cn.itcast.demo1123;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Apple on 16/11/24.
 */
public class TestHoter {
    public static void main(String[] args) {
        ArrayList<employee> list=new ArrayList<>();
        addemployee(list);
//        luckyemployee(list);
    }
    public static void addemployee(ArrayList<employee>list){
        manager m=new manager("laowang","经理001",3000);
        cook c=new cook("zhangsan","厨师002");
        waiter w1=new waiter("wangwu","服务员003");
        waiter w2=new waiter("zhaoliu","服务员004");
        w1.work();
        w1.server();
        w2.work();
        w2.server();
        c.work();
        c.server();
        m.work();
        list.add(w1);
        list.add(w2);
        list.add(c);
        list.add(m);
//        employee e1=new manager();
//        employee e2=new cook();
//        employee e3=new waiter();
//        employee e4=new waiter();
//        e1.setName("张三");
//        e1.setNumber("经理001");
//        e2.setName("lisi");
//        e2.setNumber("厨师002");
//        e3.setName("wangwu");
//        e3.setNumber("服务员003");
//        e4.setName("zhaoliu");
//        e4.setNumber("服务员004");
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
    }
    public static void luckyemployee(ArrayList<employee>list){
        int index =new Random().nextInt(list.size());
        employee e=list.get(index);
        System.out.println("酒店幸运员工是"+e.getName()+"工号"+e.getNumber());
    }

}
