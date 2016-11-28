package cn.itcast.demo1126;

import com.sun.xml.internal.ws.api.server.SDDocumentFilter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Apple on 16/11/26.
 */
public class demo2 {
    public static void main(String[] args) {
//        method();
        setmethod();
    }

    public static void setmethod() {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,1995);
        c.set(Calendar.MONTH,10);
        c.set(Calendar.DAY_OF_MONTH,28);
        int day=c.get(Calendar.DAY_OF_MONTH);
        int mouth=c.get(Calendar.MONTH);
        int year=c.get(Calendar.YEAR);
        System.out.println(" "+year+mouth+day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=c.getTime();
        System.out.println(sdf.format(d));

    }

    public static void method() {
        //获取日期对象
        Calendar c = Calendar.getInstance();
        //获取时间字段值，字段参见帮助文档
        int year = c.get(Calendar.YEAR);
        //指定字段增加某值
        //修改当前时间为3天后
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.DAY_OF_MONTH, 3);
        int day = c.get(Calendar.DAY_OF_MONTH);


        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        c.add(Calendar.HOUR_OF_DAY,10);
        int hour=c.get(Calendar.HOUR_OF_DAY);

        System.out.println(year + "" + day+hour);

    }


}
