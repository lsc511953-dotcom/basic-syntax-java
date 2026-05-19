import java.util.Arrays;

/**
 * 这个类主要补充一下Arrays类的一些方法
 */
public class Test5 {
    public static void main1(String[] args) {
        //第一个是Arrays.equal
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1,arr2));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        //Arrays.fill(arr,4);//全部赋值为4
        System.out.println(Arrays.toString(arr));
        //现在我们来部分赋值为4
        Arrays.fill(arr,1,3,4);//前闭后开
        System.out.println(Arrays.toString(arr));
    }
}
