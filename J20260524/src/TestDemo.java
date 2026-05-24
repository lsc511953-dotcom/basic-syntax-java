/**
 * 这里主要讲多态的向下转型
 */
public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Bird(2,"小邱");
        if(animal instanceof Bird) {
            Bird bird= (Bird) animal;
            bird.fly();
            System.out.println("animal是Bird的实例");
        }else{
            System.out.println("animal不是Bird的实例");
        }

        Animal animal2 = new Fish(1,"小金");
        if(animal2 instanceof Fish) {
            Fish fish = (Fish) animal2;
            fish.swim();
            System.out.println("animal是fish的实例");
        }else{
            System.out.println("animal不是fish的实例");
        }
    }
}

class Bird extends Animal{
    public int age;
    public String name;

    public Bird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + "正在吃鸟粮");
    }

    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}

class Fish extends Animal{
    public int age;
    public String name;

    public Fish(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + "正在吃鱼粮");
    }

    public void swim() {
        System.out.println(this.name + "正在游泳");
    }
}