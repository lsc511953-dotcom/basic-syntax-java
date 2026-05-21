/**
 * 测试WashMachine类
 */
public class Test1 {
    public static void main(String[] args) {
        //实例化(创建)一个WashMachine对象,实例化是要加new关键字
        //实例化对象分为两步,第一为对象分配空间,第二步调用对应构造方法
        //构造方法由编译器自动调用
        WashMachine washMachine = new WashMachine("美的","全自动超薄款",850.0,550.0,560.0);
        washMachine.setTime();//调用这个类的实例方法
        System.out.println(washMachine.brand);//打印一下这个类的实例变量
    }
}
