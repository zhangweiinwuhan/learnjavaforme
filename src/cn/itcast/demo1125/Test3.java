package cn.itcast.demo1125;

import java.util.Scanner;

/**
 * Created by Apple on 16/11/25.
 *
 *
 *(1)从键盘循环录入录入一个字符串,输入"end"表示结束
 (2)定义一个方法
 public Object[] deleteSubString(String str1,String str2) {
 }
 (3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
 * 该数组的第一个元素为删除所有的str2后的最终的字符串
 * 该数组的第二个元素为删除的str2的个数
 */
public class Test3 {
    public static void main(String[] args) {
        String s=end();
        Object[]objects=deleteSubString(s,"java");
        System.out.println(objects[0]);
        System.out.println(objects[1]);
    }
    public static String end(){
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        while (true){
        System.out.println("请输入一个字符串：");
            String s1=sc.nextLine();
            if ("end".equals(s1)){
                System.out.println("程序结束！");
                break;
            }sb.append(s1);
        }return sb.toString();
    }
//    (1)从键盘循环录入录入一个字符串,输入"end"表示结束
    public static Object[] deleteSubString(String str1,String str2){
        Object[] objects=new Object[2];
        String news=str1.replace(str2,"");
        int count=(str1.length()-news.length())/str2.length();
        objects[0]=news;
        objects[1]=count;
        return objects;
    }
}
