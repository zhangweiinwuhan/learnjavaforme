package cn.itcast.Test1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Employee {

/*    标准格式包含: 私有属性   无参构造  有参构造  setter 和getter 需求中的方法
    需求一：
    员工类Employee
    属性：姓名name,工号id,工资salary
    行为：显示所有成员信息的方法show()*/
    private String name;
    private String id;
    private int salary;

    public Employee(){}
    public Employee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void show(){
        System.out.println("姓名"+name+"工号"+id+"工资"+salary);
    }
}
