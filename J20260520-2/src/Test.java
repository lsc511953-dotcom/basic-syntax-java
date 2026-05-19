import java.util.Arrays;

/**
 * 这个类主要复习一下数组的应用场景
 */
public class Test {
    //第一个应用场景,保留数据
    public static void main1(String[] args) {
        int[] a = new int[] { 1,2,3,4,5};//这里用数组保留了1-5的数据
        System.out.println(Arrays.toString(a));
    }

    //第二个应用场景,做函数参数
    public static void test(int[] arr) {
        arr[1] = 2;//这里把传过来的数组下标为1的元素改为了2
    }
    public static void main2(String[] args) {
        int[] arr = {3,4,5,6};
        test(arr);//把数组作为实参传了过去,当然传递的是数组首元素的地址
        System.out.println(Arrays.toString(arr));
    }

    //第三个应用场景,做函数返回值
    public  static double[] func() {
      return new double[] {3.14,2.34,2.56};//将数组作为返回值
    }

    public static void main(String[] args) {
        double[] d1 = {1.3,4.32,4.45};
        double[] d2 = func();
        System.out.println(Arrays.toString(d2));
    }
}
