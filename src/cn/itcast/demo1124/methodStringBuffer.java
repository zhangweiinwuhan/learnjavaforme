package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 */
public class methodStringBuffer {
    public static void main(String[] args) {
//        创建一个字符串缓冲区对象。用于存储数据。
        StringBuffer sb=new StringBuffer();
        sb.append("haha");//添加字符串
        sb.insert(2,"it");//在指定位置插入
        sb.delete(1,4);//删除
        sb.replace(1,4,"cast");
        //替换指定范围内的内容
        String s=sb.toString();
        System.out.println(s);
//        添加数据。不断的添加数据后，要对缓冲区的最后的数据进行操作，必须转成字符串才可以。
        String str=sb.append(true).append("hehe").append(3.14).toString();
        System.out.println(str);
    }
/*
    注意：append、delete、insert、replace、reverse方法调用后，
    返回值都是当前对象自己，
    所以说，StringBuffer它可以改变字符序列的长度和内容。
*/
}
