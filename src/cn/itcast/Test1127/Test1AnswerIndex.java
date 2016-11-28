package cn.itcast.Test1127;

import java.util.Random;

/**
 * Created by Apple on 16/11/28.
 */
public class Test1AnswerIndex {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Random r=new Random();
        StringBuffer sb=new StringBuffer();
        int index=0;
        while (true){
            int x=r.nextInt(9)+1;
            if (sb.indexOf(x+"")==-1){
                sb.append(x);
            }
            if (sb.length()==7){
                System.out.println(sb.toString());
                break;
            }
        }
    }
}
