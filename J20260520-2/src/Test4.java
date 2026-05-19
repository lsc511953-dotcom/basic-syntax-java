import java.util.Arrays;

/**
 * 这个类主要练习一下数组的顺序问题,包括常见的冒泡排序和数组逆序问题
 */
public class Test4 {
    //现在我们来写一个冒泡排序方法,来对数组进行一个排序,在这里我们来对数组进行一个升序,降序同理
    //因为冒泡排序的时间复杂度较高为O(N^2),我们可以对冒泡排序进行一个优化,如果本来就有序的数组
    // 我们可以加一个标志位flag,循环一次后没有执行交换,那就跳出循环,没必要再循环比较了,因为他本来就有序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            if(flag == false) {
                break;
            }
        }
    }

    public static void main1(String[] args) {
        int[] arr = {3,4,7,8,5};//在这里我们静态初始化一个整形数组,我们定义的数组是一个杂乱数组,方便观察冒泡排序
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序的性能较低,官方提供了一个更好的排序方法
    public static void main2(String[] args) {
        int[] arr = {1,4,2,6,9,3,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //复习完冒牌排序,现在我们来写一下使数组逆序的方法
    //说到数组逆序,我们可以想到交换,把后面的交换到前面去
    public static void reverse(int[] arr) {
        int i = 0;//定义左边的位置下标
        int j = arr.length - 1;//定义右边的位置下标
        while(i < j) {
            swap(arr,i,j);//调用交换方法,传数组的首元素地址过去和i下标和j下标
            i++;
            j--;
        }
    }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};//在这里,我们定义一个升序数组,进行数组逆序之后结果应该是变成降序数组
        //我们调用逆序方法
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
