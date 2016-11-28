package cn.itcast.Test1127;

import java.util.Random;

/**
 * Created by Apple on 16/11/27.
 * 1,写一个彩票的生成代码： 1-9随机选7个不重复的数字；
 * 要求：程序每运行一次输出一条 包含7个数字的字符串 ，并且7个数字各不相同。
 */
public class Test1 {
    public static void main(String[] args) {
        String s = haoma();//产生第一个随机数
        StringBuffer sb1=new StringBuffer();
        String s2=sb1.append(s).toString();
        String s1=haoma();
        System.out.println(s1);
        //出现7个在1-9随机不重复的数字；
        if (s.length()<7){
            //如果没有7个就继续产生
            haoma();
            abc(s);//判断随机数是否相等
        }else {
            //如果随机数不小于8则打印
            System.out.println(s.substring(0,s.length()));
        }
    }
    public static String haoma() {
//        1-9随机选1个数字；
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
            int a = r.nextInt(9) + 1;
            sb.append(a);
        String st = sb.toString();
//        System.out.println(st);
        return st;
    }
    public static void abc(String s) {
        String st = s;
        char[] ch = st.toCharArray();
        StringBuffer sb = new StringBuffer();
        boolean b = true;
        for (int i = 0; i < st.length(); i++) {
            for (int j = 1; j < st.length(); j++) {
                if (ch[i] == ch[j]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sb.append(ch);
                System.out.println(sb.toString());
            }
        }
    }
    public static void asd(){
        StringBuffer sb=new StringBuffer();

    }
}