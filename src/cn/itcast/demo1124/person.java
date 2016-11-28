package cn.itcast.demo1124;

/**
 * Created by Apple on 16/11/24.
 */
 class person extends Object{
     /*
 	描述人这个类，并定义功能根据年龄判断是否是同龄人
 	由于要根据指定类的属性进行比较，这时只要覆盖Object中的equals方法
 	在方法体中根据类的属性值进行比较
 */

    private String name;
     private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public person(){}

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
//        equals方法，用于比较两个对象是否相同
        //复写父类的equals方法，实现自己的比较方式
        if (this==obj){
            //判断当前调用equals方法的对象和传递进来的对象是否是同一个
            return true;
        }
        if (!(obj instanceof person)){
            //判断传递进来的对象是否是Person类型
            return false;
        }
        //将obj向下转型为Perosn引用，访问其属性
        person p=(person)obj;
        return this.age==p.age;
    }
/*
    toString方法返回该对象的字符串表示，
    其实该字符串内容就是对象的类型+@+内存地址值。
*/
    public String toString(){
        //根据Person类的属性重写toString方法
        return "Person[age="+age+"]";
    }
}
/*
注意：在复写Object中的equals方法时，
一定要注意public boolean equals(Object obj)
的参数是Object类型，
在调用对象的属性时，
一定要进行类型转换，
在转换之前必须进行类型判断。*/
