/**
 * 这个类讲一下类变量怎么初始化
 */
public class Dog {
    public static int age = 10;//就地初始化;
    public static String name;

    //静态代码块初始化
    {
        name = "小黄";
    }
}
