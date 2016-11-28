package cn.itcast.demo111901;

/**
 * Created by Apple on 16/11/19.
 */
public class TestAnimal111 {
    public static void main(String[] args) {
        Animal cat=new Cat();
        Animal dog=new Dog();
        function(cat);
        function(dog);
//        调用该方法分别传递Dog对象 和Cat 对象, 使用instanceof进行将转后调用eat,和他们的特有方法
    }
    public static void function(Animal animal){
        //    测试类中写一个方法,参数列表有一个参数Animla类型,
        if (animal instanceof Cat){
            Cat c=(Cat)animal;
            c.eat();
            c.catchMouse();
        }
        if (animal instanceof Dog){
            Dog d=(Dog)animal;
            d.eat();d.lookHome();
        }
    }
}
