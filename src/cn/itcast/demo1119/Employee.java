package cn.itcast.demo1119;

/**
 * Created by Apple on 16/11/20.
 */
public abstract class Employee {
    private String name;
    private String nunmber;

    public Employee(){}

    public Employee(String name,String nunmber){
        this.name=name;
        this.nunmber=nunmber;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNunmber() {
        return nunmber;
    }

    public void setNunmber(String nunmber) {
        this.nunmber = nunmber;
    }
}
