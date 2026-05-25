/**
 * 静态内部类
 */
class OuterClass{
    public int data1 = 1;
    public int data2 = 2;
    public static int data3 = 3;

    static class InnerClass{
        public int data4 = 4;
        public int data5 = 5;
        public int data6 = 6;

        public void test() {
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.data1);
            System.out.println(outerClass.data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
        }

    }
}

/**
 * 实例内部类
 */
class OuterClass2{
    public int data1 = 1;
    public int data2 = 2;
    public static int data3 = 3;

    class InnerClass2{
        public int data3 = 4;
        public int data4 = 4;
        public int data5 = 5;
        public int data6 = 6;

        public void test2(){
            System.out.println(OuterClass2.this.data3);//存在同名,外部类名.this.字段
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);

        }
    }
}

/**
 * 局部内部类
 */
class OuterClass3{
    //定义在外部类方法中或代码块中
    public void test(){
        class A{
            public int data1 = 10;
        }
        A a = new A();
        System.out.println(a.data1);
    }
}

/**
 * 这几种内部类的测试
 */
public class Test {
    public static void main1(String[] args) {
        //静态内部类的实例化
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.test();
    }

    public static void main(String[] args) {
        //实例内部类的实例化
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2().new InnerClass2();
        innerClass2.test2();
    }


}
