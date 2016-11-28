package cn.itcast.demo1119;

/**
 * Created by Apple on 16/11/20.
 */
public class JavaEE extends Develop {
    public JavaEE(){}
    public JavaEE(String name,String number){
        super(name, number);
    }
    public void work(){
        System.out.println("员工号为"+getNunmber()+"的"+getName()+"员工正在研发淘宝网站");

    }
}
