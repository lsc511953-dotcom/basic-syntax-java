import java.util.Arrays;

/**
 * 练习一下数组的写法
 * 顺便练习一下手感和加深对代码的理解
 */
public class Test {
    public static void main1(String[] args) {
        //整数数组如果是动态初始化,会自动赋值为0
        //敲一下整型数组
        int[] arr = new int[4];//动态初始化
        int[] arr2 = new int[]{1, 2, 3, 4, 5};//静态初始化

        //浮点型数组,如果是单精度浮点型且是动态初始化那么会赋值0.0f,如果是双精度浮点型且是动态初始化,那么会自动赋值为0.0
        //敲一下浮点型数组
        double[] arr3 = new double[5];//动态初始化
        double[][] arr4 = new double[][]{{1.3, 3.24, 2.3}};//静态初始化

        //字符型数组,如果是动态初始化,那么会自动赋值为/u0000
        //敲一下字符型数组
        char[] c = new char[4];//动态初始化
        char[] c1 = new char[]{'s', 'd', 'f'};//静态初始化

        //布尔型数组,如果是动态初始化,那么会自动赋值为false;
        //敲一下布尔型数组
        boolean[] b1 = new boolean[2];
        boolean[] b2 = new boolean[]{false, true};

        //敲一下字符串型数组
        //如果是引用类型数组,如果是动态初始化,那么会自动赋值为null
        String[] s1 = new String[2];//动态初始化
        String[] s2 = new String[]{"sdd", "sksak"};//静态初始化
    }

    /**
     * 练习一下数组元素的访问和遍历数组
     * 数组下标从0开始
     */
    public static void main2(String[] args) {
        int[] arr = {12, 2, 3, 4, 5, 6};//静态初始化初始化一个整形数组
        System.out.println(arr[1]);//访问数组下标为1的元素
        System.out.println(arr[4]);//访问数组下标为4的数组

        //开始遍历数组,本次采用for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //开始遍历数组,本次采用for-each循环,也就是增强for循环
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        //开始遍历数组,本次采用字符串输出数组
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 下面来加深引用的理解
     */
    public static void main(String[] args) {
        int[] arr = new int[3];//采用动态初始化,方便下面赋值来加深对引用的理解
        arr[0] = 100;//表数下标为0的元素赋值为100,也就是第一个元素赋值为100
        arr[1] = 200;//数组下标为1的元素赋值为200,也就是第二个元素赋值为200
        arr[2] = 300;//数组下标为2的元素赋值为300,也就是第三个元素赋值为300

        int[] arr2 = new int[3];//采用动态初始化,与第一个数组用途一样
        arr2[0] = 400;//数组下标为0的元素赋值为400,也就是第一个元素赋值为400
        arr2[1] = 500;//数组下标为1的元素赋值为500,也就是第二个元素赋值为500
        arr2[2] = 600;//数组下标为2的元素赋值为600,也就是第三个元素赋值为600

        //上面已经给两个整形数组赋值好了,我们知道数组是引用类型.
        // 数组名存的是数组首元素的地址,指向该数组的首元素,现在我们将一个数组名值赋给另一个数组名
        arr = arr2;//在这里是将第二个数组的首元素的地址赋给了第一个数组,执行完这一行,arr会指向arr2这个数组
        arr[0] = 100;
        arr[2] = 300;
        System.out.println(Arrays.toString(arr2));//结果为[100, 500, 300]
    }
}