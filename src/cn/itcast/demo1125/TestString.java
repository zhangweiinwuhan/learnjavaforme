package cn.itcast.demo1125;

/**
 * Created by Apple on 16/11/25.
 */
public class TestString {
    public static void main(String[] args) {
        String s=" 1234asdfASDF ";
//        (1)boolean isEmpty():
//        判断字符串是不是空串,如果是空的就返回true
        boolean b=s.isEmpty();
        System.out.println(b);

//        (2)char charAt(int index):
//        返回索引上的字符
        char a=s.charAt(5);
        System.out.println(a);

//        (3)String toLowerCase():
//        字符串转成小写
        String s1=s.toLowerCase();
        System.out.println(s1);

//        (4)String toUpperCase(): 字符串转成大写
        String s2=s.toUpperCase();
        System.out.println(s2);

//        (5)String repalce(char oldChar, char newChar):
//        将字符串中的老字符,替换为新字符
        String s3=s.replace('a','1');
        System.out.println(s3);

//        (6)String repalce(String old, String newstr):
//        将字符串中的老字符串,替换为新字符串
        String s4=s.replace("asdf","hjkl");
        System.out.println(s4);

//        (7)String trim(): 去掉字符串两端空格
        String s5=s.trim();
        System.out.println(s5);
    }

}
