package cn.itcast.demo1120;

/**
 * Created by Apple on 16/11/20.
 */
public class jiaohuan {
    public static void main(String[] args) {
    change();

    }
    public static void change(){
//        char a=’f’ char b=’e’   交换这两个变量的值
        char a='f';
        char b='e';
        char c= a;
//        System.out.println(c);
        a=b;
//        System.out.println(a);
        b=c;
//        System.out.println(b);
        System.out.println("a="+a+",b="+b);

    }
}
