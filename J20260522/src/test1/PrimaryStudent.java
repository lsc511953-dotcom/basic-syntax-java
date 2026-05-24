package test1;

/**
 * 在这个类讲一下代码块初始化
 * 静态成员初始化有就地初始化和静态代码块初始化
 * 实例成员有就地初始化和实例代码块初始化和构造方法初始化
 */
public class PrimaryStudent {
    public int age;
    public String name;
    public static String classRoom;

    //静态代码快是为了给静态成员初始化
    static{
        classRoom = "101";
    }

    {
        age = 10;
        name = "小明";
    }

    public static void main(String[] args) {
        PrimaryStudent primaryStudent = new PrimaryStudent();
        System.out.println(primaryStudent.age);
        System.out.println(primaryStudent.name);
        System.out.println(PrimaryStudent.classRoom);//静态成员用类名+.字段名访问
    }
}
