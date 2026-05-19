import java.util.Arrays;

/**
 * 这个类主要练习一下数组拷贝
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //定义一个待拷贝数组
        int[] copy = new int[arr.length];//定义一个拷贝数组,这里采用动态初始化
        //第一种方式,使用for循环来拷贝
        for(int i = 0;i < arr.length;i++) {
            copy[i] = arr[i];
        }

        for(int x : copy) {
            System.out.print(x + " ");
        }

        System.out.println();

        //第二种方式,采用Arrays.copyOf来拷贝
        int[] copy2 = Arrays.copyOf(arr,3);//这里用这个函数,要指定拷贝哪个数组,拷贝多长

        for(int x : copy2) {
            System.out.print(x + " ");
        }

        System.out.println();

        //第三种方式,如果要指定从哪里开始开始拷贝,到哪结束,用Arrays.copyOfRange,前闭后开
        int[] copy3 = Arrays.copyOfRange(arr,1,3);//这里肯定是要填拷贝哪个数组,从哪开始,到哪结束;

        for(int x : copy3) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
