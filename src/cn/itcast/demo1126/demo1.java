package cn.itcast.demo1126;

/**
 * Created by Apple on 16/11/26.
 */
public class demo1 {
    public static void main(String[] args) {
//        规则："[0-9]{6,12}"
//        该规则需要匹配的内容是：长度为6位到12位的数字。
        String s1 = "123456";
        String regex = "[0-9]{6,12}";
        boolean flag = s1.matches(regex);
        System.out.println(flag);
//        该规则需要匹配的内容是：11位的手机号码，
//        第1位为1，第2位为3、4、5、7、8中的一个，
//        后面9位为0到9之间的任意数字。
        String s2 = "18827063552";
        String regex1 = "1[34578][0-9]{9}";
        boolean flag1 = s2.matches(regex1);
        System.out.println(flag1);

/*        举例：校验qq号码.
        1: 要求必须是5-15位数字
        2: 0不能开头*/
        String qq = "357845878";
        String r1 = "[1-9][0-9]{4,14}";
        //因为开头已经定义了第一个字符，所以后面数字范围在｛4，15｝
        boolean f1 = qq.matches(r1);
        System.out.println(f1);

/*        举例：校验手机号码
        1：要求为11位数字
        2：第1位为1，第2位为3、4、5、7、8中的一个，
        后面9位为0到9之间的任意数字。*/
        String s3 = "13797479756";
        String r2 = "1[34578][0-9]{9}";
        boolean f2 = s3.matches(r2);
        System.out.println(f2);

//        分割出字符串中的的数字
        String s4 = "18-22-40-65";
        String r3 = "-";
        String[] result = s4.split(r3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

//        举例：把文字中的数字替换成*
        String s5="Hello12345World6789012";
        String r4="[0-9]";
        String result1=s5.replaceAll(r4,"*");
        System.out.println(result1);

//        获取IP地址(192.168.1.100)中的每段数字
        String s6="192.168.1.100";
        String r5="\\.";
        String [] result2=s6.split(r5);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }

    }
}
