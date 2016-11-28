package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 */
public class TestStringBuffer {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr){
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1){
                sb.append(arr[i]+",");
            }else {
                sb.append(arr[i]+"]");
            }
        }return  sb.toString();
    }
}
