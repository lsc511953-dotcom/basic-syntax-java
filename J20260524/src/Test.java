/**
 * 这里主要讲向上转型
 */
public class Test {

    public static void func(Animal animal) {
        animal.eat();;
    }

    public static Animal getAnimal(int n) {
        if(n > 2) {
            return new Dog();
        }else{
            return new Cat();
        }
    }
    //直接赋值
    public static void main1(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;//向上转型    相当于Animal animal = new Dog();
        animal.eat();//会发生多态

        Cat cat = new Cat();
        Animal animal2 = cat;//向上转型    相当于Animal animal2 = new Cat();
        animal2.eat();//会发生多态
    }

    //方法参数传递
    public static void main2(String[] args) {
        Dog dog = new Dog();
        func(dog);

        Cat cat = new Cat();
        func(cat);
    }

    //方法返回值传递
    public static void main(String[] args) {
        Animal animal = getAnimal(2);
        animal.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("正在吃饭");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗正在吃狗粮");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫正在吃猫粮");
    }
}


