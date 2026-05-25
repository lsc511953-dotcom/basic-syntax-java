/**
 * 在这个类讲一下匿名内部类
 * 匿名内部类就是隐藏名字的内部类
 */

interface Greeting{
    void greet();
}

abstract class Animal{
    public abstract void swim();
}

public class TestDemo {
    public static void main1(String[] args) {
        //这里有三步
        //1.实现关系
        //2.方法重写
        //3.实例化对象
        Greeting greet = new Greeting() {
            @Override
            public void greet() {
                System.out.println("哈哈");
            }
        };

        greet.greet();
    }

    public static void main(String[] args) {
        //这里有三步
        //1.继承关系
        //2.方法重写
        //3.实例化对象
        Animal animal = new Animal() {
            @Override
            public void swim() {
                System.out.println("嘻嘻");
            }
        };

        animal.swim();
    }
}


