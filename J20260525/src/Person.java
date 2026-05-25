/**
 * Cloneable 接口和深拷贝
 */

class Money implements Cloneable{
    public double money = 9.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Person implements Cloneable{
    public int age;
    public String name;

    public Money m = new Money();

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //修改一下成为深拷贝
        Person tmp = (Person)super.clone();
        tmp.m = (Money)this.m.clone();
        return tmp;
    }
}

class TestDemo2{
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person(10,"小明");
        Person person2 = (Person)person.clone();

        person.m.money = 99.9;

        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
