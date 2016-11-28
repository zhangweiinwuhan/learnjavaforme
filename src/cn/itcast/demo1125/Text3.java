package cn.itcast.demo1125;

import java.util.Scanner;

/**
 * Created by Apple on 16/11/25.
 * <p>
 * <p>
 * (1)从键盘循环录入录入一个字符串,输入"end"表示结束
 * (2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
 * 举例:
 * 键盘录入：Hello12345World
 * 输出结果：hELLO*****wORLD
 * 总共10个字母
 */
public class Text3 {
    public static void main(String[] args) {
        String s=panduan();
        System.out.println(change(s));
    }
    public static String panduan() {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer();
        while (true) {
            System.out.println("请输入一个字符串：");
            String s = sc.nextLine();
            if ("end".equals(s)) {
                System.out.println("程序结束");
                break;
            }
            sb1.append(s);
        }
        return sb1.toString();
    }

    public static String change(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c += 32;
                sb.append(c);
            } else if (c >= 97 && c <= 122) {
                c -= 32;
                sb.append(c);
            } else {
                c = '*';
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
