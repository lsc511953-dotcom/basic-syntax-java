/**
 * 在这个类我们来讲一下实例代码块和静态代码块和构造方法的执行顺序
 * 同时静态成员，谁在前，谁先执行，同时实例成员同理
 */
public class Student {
    public int age = 10;
    public String name = "张三";
    {
        System.out.println("实例代码块执行.......");
    }

    static {
        System.out.println("静态代码块执行..........");
    }

    public Student() {
        System.out.println("构造方法执行......");
    }

}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
    }
}
