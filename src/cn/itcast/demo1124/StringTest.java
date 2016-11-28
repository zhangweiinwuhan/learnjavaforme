package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 */
public class StringTest {
    public static void main(String[] args) {
        String str ="asjhdASJHGD2344657";
        getCount(str);
        String s1=str.substring(2);
        //返回一个新字符串，内容为指定位置开始到字符串末尾的所有字符
        String s2=str.substring(2,8);
        //返回一个新字符串，内容为指定位置开始到指定位置结束所有字符
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        boolean  b1=str.startsWith("as");
        //判断是否以给定字符串开头
        boolean  b2=str.endsWith("1");
        //判断是否以给定字符串结尾
        System.out.println(b1+" . ."+b2);
        int index = str.indexOf("2344");
        //判断是否包含指定字符串，包含则返回第一次出现该字符串的索引，不包含则返回-1
        System.out.println(index);
        boolean b3=str.contains("2344");
        //判断是否包含指定字符串，包含返回true，不包含返回false
        System.out.println(b3);

//        将字符串转成一个字符数组。或者字节数组。
        char[]chs=str.toCharArray();
        byte[]bytes=str.getBytes();
        for (int i = 0; i <chs.length ; i++) {
            System.out.print(chs[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < bytes.length; i++) {

            System.out.print(bytes[i]+" ");
        }
        System.out.println();

//        判断两个字符串中的内容是否相同
        String str2="ab";
        String str3="AS";
        boolean b11=str.equals(str2);
        boolean b22=str.equals(str3);
        System.out.println("" +b11+"..."+b22);
//        获取该字符串对象中的内容
        System.out.println(str.toString());
        System.out.println(str);
    }

    public static void getCount(String str) {
/*        题目一：获取指定字符串中，大写字母、小写字母、数字的个数。
        思路：1.为了统计大写字母、小写字母、数字的个数。创建3个计数的变量。
        2.为了获取到字符串中的每个字符，进行字符串的遍历，得到每个字符。
        3.对得到的字符进行判断，如果该字符为大写字母，则大写字母个数+1；如果该字符为小写字母，则小写字母个数+1；如果该字符为数字，则数字个数+1。
        4.显示大写字母、小写字母、数字的个数*/
        int upper =0;//大写字母的个数
        int lower=0;//小写字母的个数
        int digit =0;//数字的个数
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
//            获取指定位置上的字符
            if (c >=65 && c <=90){
                upper++;
            }else if (c >=97 && c<=122){
                lower++;
            }else if (c >=48 && c<=57){
              digit++;
            }
        }
        System.out.println("大写字母个数："+upper);
        System.out.println("小写字母个数："+lower);
        System.out.println("数字个数："+digit);
    }
}
