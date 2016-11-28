package cn.itcast.demo1127;

import java.util.Arrays;

/**
 * Created by Apple on 16/11/27.
 */
public class Testarr {
    public static void main(String[] args) {
        int []arr={11,22,33,44,55,66,77,88,99,10};
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int []result=new int[3];
        System.arraycopy(arr,0,result,0,3);
        /*
        for (int i = 0; i < 3; i++) {
            result[i]=arr[i];
        }
        *
        * */
        return result;

    }
}
