package cn.itcast.demo1125;

import java.util.Scanner;

/**
 * Created by Apple on 16/11/25.
 */
public class method {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println(getPropertyGetMethodName(st));
    }
    public static  String getPropertyGetMethodName(String property){
//          该方法的参数为String类型，
//          表示用户给定的成员变量的名字，
//          返回值类型为String类型，

        String s1= property.substring(0,1);
        s1=s1.toUpperCase();
        String s2=property.substring(1);
        StringBuffer sb=new StringBuffer();

//          用户调用此方法时给定的参数为"name",
//          该方法的返回值为"getName"
        sb.append("get").append(s1).append(s2);

//        返回值为成员变量对应的get方法的名字
        return  sb.toString();
    }
}
