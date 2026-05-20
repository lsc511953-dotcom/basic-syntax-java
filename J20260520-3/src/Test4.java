/**
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false
 *
 * 示例 1：
 *
 * 输入：arr = [2,6,4,1]
 *
 * 输出：false
 *
 * 解释：不存在连续三个元素都是奇数的情况。
 *
 * 示例 2：
 *
 * 输入：arr = [1,2,34,3,4,5,7,23,12]
 *
 * 输出：true
 *
 * 解释：存在连续三个元素都是奇数的情况，即 [5,7,23]
 */
public class Test4 {
    public static boolean function(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {//判断是奇数,那就加
                count++;
                if(count == 3) {//如果count == 3,那就说明这个数组存在三个连续的奇数,那就返回true
                    return true;
                }
            }else{
                count = 0;//如果判断是偶数,count置为0
            }
        }

        return false;//循环执行完了,如果没有返回true,那就是这个数组中不存在三个连续的奇数,那就返回false
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4};//给定一个存在三个元素都是奇数的数组,我们写的方法返回true,才有可能是正确的
        boolean result = function(arr);
        System.out.println(result);
    }
}
