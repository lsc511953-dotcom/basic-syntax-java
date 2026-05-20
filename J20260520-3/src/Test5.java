import java.util.Arrays;

/**
 * 复习一下二维数组的动态初始化和静态初始化和复习一下二维数组的遍历
 */
public class Test5 {
    public static void main(String[] args) {
        //二维数组的动态初始化
        int[][] arr = new int[2][3];

        //二维数组的静态初始化
        int[][] arr2 = new int[][] {{1,2,3,4},{2,3,4,5}};

        //二位数组的遍历
        //第一种for循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=========================================");

        //第二种遍历方法,for-each增强for循环遍历
        for(int[] tempArray : arr2 ) {
            for(int x :  tempArray) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println("=================================");

        //第三种遍历方式,用官方给的方法
        System.out.println(Arrays.deepToString(arr2));
    }
}

/**
 * 复习一下不规则二维数组
 */
class Test6{
    public static void main(String[] args) {
        int[][] arr = new int[2][];//现在定义行,不定义列,后面在设置一行有几列,如果设置不一样就成了不规则数组
        arr[0] = new int[3];//第一行定义的是三个元素
        arr[1] = new int[2];//第二行定义的是两个元素

        //经过现在的赋值,这个二维数组已经变成了不规则二维数组
        //我们来验证一下,上面采用的是动态初始化且是整数数组,如果打印这个数组的话,值会全为0
        System.out.println(Arrays.deepToString(arr));//[[0, 0, 0], [0, 0]]  我们可以看到这个数组是不规则的且元素全为0
    }
}
