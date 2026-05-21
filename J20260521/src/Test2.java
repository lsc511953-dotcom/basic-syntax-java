/**
 * 交换两个实参的值
 */
public class Test2 {
    public static void swap(MyValue val1,MyValue val2) {
        int temp = val1.val;
        val1.val = val2.val;
        val2.val = val1.val;
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;

        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        System.out.println("交换前两个值为: a = " + myValue1.val + " b = " + myValue2.val);

        swap(myValue1,myValue2);
        System.out.println("交换后两个值为: a = " + myValue1.val + " b = " + myValue2.val);
    }
}
