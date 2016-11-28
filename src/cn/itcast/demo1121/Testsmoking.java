package cn.itcast.demo1121;

/**
 * Created by Apple on 16/11/21.
 */
public class Testsmoking {
    public static void main(String[] args) {
        new smoking(){
            public void smok(){
                System.out.println("有人抽烟");
            }
        }.smok();
    }
}
