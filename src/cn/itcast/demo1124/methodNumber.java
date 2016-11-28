package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 *
 *
 * 题目三：查询大字符串中，出现指定小字符串的次数。
 * 如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数。
 思路：1.在大串中，查找小串出现的位置，出现了就次数+1
 2.在上次小串出现位置的后面继续查找，需要更改大串的内容为上次未查询到的字符串。
 3.回到第一步，继续查找小串出现的位置，直到大串中查询不到小串为止

 */
public class methodNumber {
    public static void main(String[] args) {
        String s="hellojava,nihaojava,javazhenbang";
        String s1="java";
        System.out.println(getCount(s,s1));
    }
    public static int getCount(String big,String small){
        int count=0;//出现小串的次数
        int index=-1;//出现小串的位置
        /*
		while的循环条件三步骤：
		步骤一. big.indexOf(small) 获取小串在大串中出现的位置
		步骤二. 把小串出现的位置，赋值给变量index
		步骤三. 判断出现的位置是否为-1， 如果位置等于-1，说明大串中已经查询不到小串了；如果位置不等于-1，那么，进行循环，完成次数累加与修改大串的操作
		*/
        while ((index = big.indexOf(small))!=-1){
            count++;//出现次数+1
            //更改大串内容
            big=big.substring(index+small.length());
        }
        return count;
    }
}
