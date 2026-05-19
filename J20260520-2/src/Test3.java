import java.util.Arrays;

/**
 * 该类主要练习一下数组的各种查找
 */
public class Test3 {

    //顺序查找
    public static int find(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};//静态初始化一个数组来进行这个数组的查找
        int result = find(arr,3);//这个函数功能是在这个数组中找输入的元素,找到返回数组下标,找不到返回-1;
        if(result == -1) {
            System.out.println("在这个数组里找不到该元素");
        }else{
            System.out.println("在这个数组里找到了该元素,数组下标为 " + result);
        }
    }

    //二分查找
    public static int binarySearch(int[] arr,int key) {
        int left = 0;//定义左边的开始位置
        int right = arr.length - 1;//定义右边的开始位置

        //开始循环,注意循环条件
        while(left <= right) {
            int mid = left + (right - left) / 2;//这个条件必须写在里面
            if(arr[mid] < key) {
                left = mid + 1;
            }else if(arr[mid] > key){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = binarySearch(arr,3);
        if(result == -1) {
            System.out.println("在该数组中找不到该元素");
        }else{
            System.out.println("在该数组中找到了该元素,数组下标为 " + result);
        }
    }

    //虽然我们可以用自己写的二分查找方法,但是官方给我们提供了这个方法,我们可以直接用,减少工作量,加快工作效率
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int result = Arrays.binarySearch(arr,3);
        if(result < 0) {
            System.out.println("在该数组找不到该元素");
        }else{
            System.out.println("在该数组中找到了该元素,该元素在数组中下标为 " + result);
        }
    }
}
