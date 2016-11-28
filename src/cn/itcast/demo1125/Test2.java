package cn.itcast.demo1125;

/**
 * Created by Apple on 16/11/25.
 * (1)定义数字字符串数组{"010","3223","666","7890987","123123"}
 (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
 第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
 (3)如：010 是对称的，3223 是对称的，123123 不是对称的
 (4)最终打印该数组中对称字符串的个数

 提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。

 */
public class Test2 {
    public static void main(String[] args) {
//        (1)定义数字字符串数组
        String[] arr = {"010", "3223", "666", "7890987", "123123"};
        method(arr);
    }
    public static void method(String []arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            (2)判断该数字字符串数组中的数字字符串是否是对称
//                  (第一个数字和最后一个数字相等，
//                  第二个数字和倒数第二个数字是相等的，
//                  依次类推)的，并逐个输出
            boolean b = true;
            String str = arr[i];
            char[] c = str.toCharArray();
            for (int j = 0, k = c.length - 1; j < k; j++, k--) {
                if (c[j] != c[k]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                count++;
                System.out.println(arr[i]);
            }
        }
//        (4)最终打印该数组中对称字符串的个数
        System.out.println(count);
    }
}