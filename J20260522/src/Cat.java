/**
 * 在这个类讲解一下成员变量怎么初始化
 */
public class Cat {
    public int age = 10;//1.就地初始化
    public String name;//2.不显式赋值就默认初始化(默认使用默认值)

    //3.使用构造方法初始化
    public Cat(int age,String name) {
        this.age = age;
        this.name = name;
    }

    //4.实例代码块初始化
    {
        age = 20;
        name = "小咪";
    }

    //5.使用实例方法初始化
    public void setName(String name) {
        this.name = name;
    }
}
