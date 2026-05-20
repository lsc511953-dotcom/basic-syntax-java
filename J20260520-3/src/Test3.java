import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n / 2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5,5,5,2,3};//给定一个存在多数元素的数组
        //多数元素有三大性质,存在性和中位数特性和唯一性
        //所以我们只需要对数组进行一个排序,取中间的元素就可以了
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }
}
