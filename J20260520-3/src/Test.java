import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */
public class Test {
    public static int[] twoIndex(int[] arr,int target) {
         int[] result = {-1,-1};//如果在这个数组中找不到加起来等于给定的整数目标值就返回这个数组,因为下标没有负数.

        //开始循环
        for(int i = 0;i < arr.length;i++) {
            for(int j = i + 1;j < arr.length;j++) {
                //如果数组的两个下标所对应的元素加起来等于给定的整数值,那就返回两个下标,要想返回就得修改result数组的元素,然后返回这个result数组
                if(arr[i] + arr[j] == target ) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

         return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};//给定一个数组
        int[] temp = twoIndex(nums,18);//在这里我们传数组首元素地址和给定一个整数目标值
        System.out.println(Arrays.toString(temp));
    }
}
