package cn.itcast.demo1126;

import java.util.Calendar;

/**
 * Created by Apple on 16/11/26.
 */
public class datedemo {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
