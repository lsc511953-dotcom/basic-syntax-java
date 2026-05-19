import java.util.Arrays;

/**
 * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素乘以 2 , 并设置到对应的数组元素上.
 */
public class Test6 {
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};//静态初始化一个数组
        System.out.println("之前的数组 " + Arrays.toString(arr));
        transform(arr);
        System.out.println("之后的数组 " + Arrays.toString(arr));
    }
}
