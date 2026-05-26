import java.util.Arrays;

/**
 * 在这个类讲一下字符串的拆分
 */
public class Test {
    public static void main1(String[] args) {
        String s1 = "hello bit hello world";
        String[] arr = s1.split(" ");//字符串的全部切分
        System.out.println(Arrays.toString(arr));//[hello, bit, hello, world]

        String[] arr2 = s1.split(" ",2);//字符串的部分拆分
        System.out.println(Arrays.toString(arr2));//[hello, bit hello world]
    }

    //字符" | "    " * "     " + "   " . "都得加上转义字符
    public static void main2(String[] args) {
        String s1 = "192.168.10.2";
        String[] arr = s1.split("\\.");
        System.out.println(Arrays.toString(arr));
    }

    //多次切分
    public static void main(String[] args) {
        String s1 = " 小明:10 | 小花:11 | 小华:11";
        String[] tempArray = s1.split("\\|");
        for(String temp : tempArray) {
           String[] content = temp.split("\\:");
           System.out.println("姓名 " + content[0] + " 年龄: " + content[1]);
        }
    }
}
