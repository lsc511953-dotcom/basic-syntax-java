import java.util.Arrays;

/**
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 *
 * 如数组：[1,2,3,4,5,6]
 *
 * 调整后可能是：[1, 5, 3, 4, 2, 6]
 */
public class Test7 {

    public  static void func(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            //左边的遇到偶数停下来,注意要加i < j
            while(i < j && arr[i] % 2 != 0) {
                i++;
            }

            //右边的遇到奇数停下来,注意要加i < j
            while(i < j && arr[j] % 2 == 0) {
                j--;
            }

            swap(arr,i,j);
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

}
