package cn.itcast.demo1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Max {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=50;
        int []arr={a,b,c};
        int max=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    max=j;
                }
            }
        }System.out.println(arr[max]);
    }
}
