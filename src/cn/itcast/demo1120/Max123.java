package cn.itcast.demo1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Max123 {
    public static void main(String[] args) {
        int [] arr={12,15,2,3,9,8,55,67,89};
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    max=j;
                }
            }
        }
        System.out.println(arr[max]);
    }
}
