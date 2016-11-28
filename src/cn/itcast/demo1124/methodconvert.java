package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 *
 *
 * 题目二：将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
 思路：1.把字符串分为两个部分，第一部分为字符串中第一个字母，第二部分为剩下的字符串。
 2.把第一部分字符串转换成大写字母，把第二部分字符串转换成小写字母
 3.把两部分字符串连接在一起，得到一个完整的字符串

 */
public class methodconvert {
    public static void main(String[] args) {
        String s="asdfJKL1234";
        System.out.println(convert(s));

    }
    public static String convert(String str){
        //获取第一部分为字符串
        String start=str.substring(0,1);
        //获取第二部分为字符串
        String end=str.substring(1);
        //把第一部分字符串转换成大写字母，把第二部分字符串转换成小写字母
        String big=start.toUpperCase();
        String small=end.toLowerCase();
        //把两部分字符串连接在一起，得到一个完整的字符串
        return big+small;
    }
}
