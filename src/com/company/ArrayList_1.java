package com.company;

/**
 * Created by Apple on 16/11/11.
 */
import java.util.ArrayList;
public class ArrayList_1 {
    public static void main(String [] args){
        ArrayList<String> array=new ArrayList<>();
        array.add("abc");
        array.add("itcast");
        array.add("love");
        array.add("java");
//        int size=array.size();
////        System.out.println(size);
//        String s=array.get(1);
//        System.out.println(s);
        for(int i=0;i < array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
