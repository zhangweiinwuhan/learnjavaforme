package cn.itcast.demo1120;

/**
 * Created by Apple on 16/11/20.
 */
public class zhisu {
    public static void main(String[] args) {
        int count = 1;
        System.out.print(2 + ",");
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    break;
                } else if (b == a - 1) {
                    System.out.print(a+",");
                    count++;
                }
            }
        }
        System.out.println("质数总共有："+count+"个");
    }
}