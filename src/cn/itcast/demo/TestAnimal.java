package cn.itcast.demo;

/**
 * Created by Apple on 16/11/19.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Dog();

        a1.eat();
        a2.eat();

        System.out.println(Function(a1));
        /*if (a1 instanceof Cat){
            Cat c=(Cat)a1;
            c.catchmouse();
        }
        if (a2 instanceof Dog){
            Dog d=(Dog)a2;
            d.lookhome();
        }*/
    }
    public static Animal Function(Animal animal){
        Cat c=new Cat();
        c.catchmouse();
        Dog d=new Dog();
        d.lookhome();
        return c;
    }
}
