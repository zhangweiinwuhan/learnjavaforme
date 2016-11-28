package cn.itcast.Test1127;

import java.util.Scanner;

/**
 * Created by Apple on 16/11/27.
 * 2,键盘录入若干格式为：aaaa.bbb 的文件类型字符串,以输入end结束;
 * 要求： 1，若文件名部分（aaaa）包含数字和英文字母以外的字符，
 * 则提示：文件名错误，请重新输入。
 * 2，若扩展名部分（bbb）不包含 "txt","java","docx","md","jar" （不要求用正则）
 * 则提示扩展名错误，请重新输入。
 * 3，输入结束之后打印格式正确的文件名(全名)
 */
public class Test2 {
    public static void main(String[] args) {
        String wenjian = end();
        String panduan = PanDuanWenJianMing(wenjian);
//        System.out.println(panduan.length());
        if (panduan.length() == 5) {
//             * 3，输入结束之后打印格式正确的文件名(全名)
            PanDuanKuoZhanMing(wenjian);
        } else {
            //判断结果为"文件名错误，请重新输入!"
            System.out.println(panduan);
        }
    }

    public static String end() {
//         * 2,键盘录入若干格式为：aaaa.bbb 的文件类型字符串,以输入end结束;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (true) {
            System.out.println("请输入一个格式为aaaa.bbb的文件类型字符串");
            String s1 = sc.nextLine();
            if ("end".equals(s1)) {
                System.out.println("程序结束！");
                break;
            }
            sb.append(s1);
        }
        return sb.toString();
    }

    public static String PanDuanWenJianMing(String wenjian) {
/*         * 要求： 1，若文件名部分（aaaa）包含数字和英文字母以外的字符，
 * 则提示：文件名错误，请重新输入。*/
        String s = wenjian;
        StringBuffer sb = new StringBuffer();
        String s1 = s.substring(0, 5);
//        System.out.println(s1.toString());
        String s2 = "[a-z0-9]{4}\\.";
//        System.out.println(s3);
        boolean b = s1.matches(s2);
//        System.out.println(b);
        return b ? s1 : "文件名错误，请重新输入!";

    }

    public static void PanDuanKuoZhanMing(String wenjian) {
/*         * 2，若扩展名部分（bbb）不包含 "txt","java","docx","md","jar" （不要求用正则）
 * 则提示扩展名错误，请重新输入。*/
        String s = wenjian;
        String s3 = s.substring(5);
        if (s3.equals("txt") || s3.equals("java") || s3.equals("md") || s3.equals("jar")) {
            System.out.println(wenjian);
        } else {
            System.out.println("扩展名错误，请重新输入!");
        }
    }

}



