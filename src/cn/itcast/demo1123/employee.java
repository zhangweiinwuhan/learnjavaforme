package cn.itcast.demo1123;

/**
 * Created by Apple on 16/11/24.
 */
public abstract class employee {
    private String name;
    private String number;
    public employee (){
        super();
    }
    public employee(String name,String number){
        super();
        this.name=name;
        this.number=number;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
