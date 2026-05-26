import java.util.Arrays;

/**
 *在这个类讲一下字符串和数组的转换和格式化
 */
public class TestDemo3 {
    public static void main1(String[] args) {
        String s1 = "asnskak";
        char[] array = s1.toCharArray();//字符串转换为数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        //下面讲一下数组转换为字符串
        char[] ch = {'a','s','d'};
        String s2 = new String(ch);
        System.out.println(s2);
    }

    //格式化
    public static void main(String[] args) {
        String s1 = String.format("%d-%d-%d",2024,3,2);
        System.out.println(s1);
    }
}
