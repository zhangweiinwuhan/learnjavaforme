package cn.itcast.demo1120;

/**
 * Created by Apple on 16/11/20.
 */
public class jioushu {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("奇数为");
        for (int i = 1; i <=100 ; i++) {
            if (i%2!=0){
                System.out.print(i+"\t");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("奇数和为："+sum);
        int sum1=0;
        System.out.println();
        System.out.println("偶数为");
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i+"\t");
                sum1+=i;
            }
        }
        System.out.println();
        System.out.println("偶数和为："+sum1);

    }
}
