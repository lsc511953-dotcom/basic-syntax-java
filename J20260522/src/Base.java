/**
 * 这里讲解一下继承
 * 子类中访问父类的成员变量,包括父类的成员变量与子类的成员变量不存在同名,父类的成员变量和子类的成员变量存在同名
 * 子类访问父类的成员方法,和子类中访问父类的成员变量原理一致,
 * 只不过如果父类和子类同名方法的参数列表不同(重载)，根据调用方法适传递的参数选择合适的方法访问，如果没有则报错；
 */
//父类
public class Base {
    public int a;
    public Base(){
        this.a = 10;
    }
}

//子类
/*class Derived extends Base{
    //父类的成员变量与子类的成员变量不存在同名
    public int b = 10;
    public int c = 20;

    public void test() {
        System.out.println(a);//访问从父类继承下来的a
        System.out.println(b);//访问子类自己的b
        System.out.println(c);//访问父类自己的c
    }
}*/

class Derived extends Base {
    //父类的成员变量和子类的成员变量存在同名
    public int a = 20;
    public int b = 30;
    public int c = 40;

    public void test() {
        System.out.println(a);//访问子类自己的a
        System.out.println(b);//访问子类自己的b
        System.out.println(c);//访问子类自己的c
        //想访问父类与子类同名的成员变量要用super关键字
        System.out.println(super.a);//访问从父类继承下来的a
    }
}

class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
