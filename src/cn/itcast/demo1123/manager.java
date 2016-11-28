package cn.itcast.demo1123;

/**
 * Created by Apple on 16/11/23.
 */
public class manager extends employee {
    private double money;
    public manager(){
        super();
    }
    public manager(String name,String number,double money){
        super(name,number);
        this.money=money;
    }
    public double getMoney(){
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void work(){
        System.out.println("我老王向来是以德服人，逮谁扣谁钱");
    }
}
