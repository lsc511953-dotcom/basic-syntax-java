/**
 * 这里讲解一下继承
 */
//父类
public class Base {
    public int a;
    public Base(){
        this.a = 10;
    }
}

//子类
class Derived extends Base{
    public int b = 10;
    public int c = 20;

    public void test() {
        System.out.println(a);//访问从父类继承下来的a
        System.out.println(b);//访问子类自己的b
        System.out.println(c);//访问父类自己的c
    }
}

class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.test();
    }
}
