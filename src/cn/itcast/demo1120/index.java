package cn.itcast.demo1120;

import java.util.Scanner;

/**
 * Created by Apple on 16/11/20.
 */
public class index {
    public static void main(String[] args) {
        int [] arr={12,15,2,3,9,8,55,67,89};
        System.out.println("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a<arr.length&&a<=0){
            System.out.println(arr[a]);
        }else {
            System.out.println("输入的值有误，请重新输入一个数！");
        }
    }
}
