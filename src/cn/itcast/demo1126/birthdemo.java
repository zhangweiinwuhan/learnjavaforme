package cn.itcast.demo1126;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Apple on 16/11/26.
 */
public class birthdemo {
    public static void main(String[] args) throws Exception{
        liveday();
    }
    public static void liveday() throws Exception {
        System.out.println("请输入您的生日：  （格式：yyyy-MM-dd）");
        String birthdayString=new Scanner(System.in).nextLine();
        //创建日期格式化对象,在获取格式化对象时可以指定风格
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //对日期进行格式化
        Date birthDate=sdf.parse(birthdayString);
        Date todayDate=new Date();
        long birthdaySecond=birthDate.getTime();
        long todaySecond=todayDate.getTime();
        //对日期进行格式化
        System.out.println(sdf.format(todayDate));
        long second=todaySecond-birthdaySecond;
        if (second<0){
            System.out.println("还没出生呢！");
        }else {
            System.out.println(second/1000/60/60/24);
        }
    }
}
