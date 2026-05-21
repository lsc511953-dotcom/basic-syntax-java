/**
 * 这里主要讲一下成员变量(实例变量)的定义和成员方法的定义和构造方法的使用
 */
public class WashMachine {
    //编译器为防止空值异常,成员变量默认会赋值,因为成员变量存储在堆区,要长久存储
    public String brand;//这里定义一个品牌的实例变量
    public String name;//这里定义一个名字的实例变量
    public double height;//这里定义一个高度的实例变量
    public double length;//这里定义一个长度的实例变量
    public double width;//这里定义一个宽度的实例变量

    //定义一个构造方法,它的作用就是给变量赋值
    public WashMachine(String brand,String name,double height,double length,double width) {
        this.brand = brand;
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    //定义实例方法
    public void setTime() {
        System.out.println("请设置时间");
    }

    public void dehydration() {
        System.out.println("正在脱水,请等待........");
    }
}

