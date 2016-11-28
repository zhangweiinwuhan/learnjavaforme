package cn.itcast.Test1120;

/**
 * Created by Apple on 16/11/20.
 */
public class Test3lei {
    public static void main(String[] args) {
//        在测试类中进行测试
        Employee e=new Employee("JavaEE","单身狗",8000);
        e.show();
        Animal a=new Animal("二狗子",6);
        a.eat();
        a.sleep();
        Person1 p=new Person1("傻彪子","男",22);
        p.study();
        p.sleep();
    }
}
