package cn.itcast.demo1123;

/**
 * Created by Apple on 16/11/23.
 */
public class waiter extends employee implements VIP {
    public waiter(){
        super();
    }
    public waiter(String name,String number){
        super(name,number);
    }

    @Override
    public void work() {
        System.out.println("全心全意为人民服务");
    }

    @Override
    public void server() {
        System.out.println("三碗不过岗，陛下，再来一杯吧");
    }

}
