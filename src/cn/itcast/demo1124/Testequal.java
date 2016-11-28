package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 */
public class Testequal {
    public static void main(String[] args) {
        person p = new person("zhangsan", 18);
        person p1 = new person("lisi", 28);
        boolean b = p.equals(p1);
        System.out.println(b);
        String s=p.toString();
        System.out.println(s);

    }
}