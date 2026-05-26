/**
 * 这个类讲一下字符串查找
 */
public class TestDemo {
    public static void main1(String[] args) {
        String s1 = "aabcdef";
        //第一个方法,返回指定下标位置的字符，index从0开始
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.print(ch + " ");
        }
    }

    //第二个方法
    //从前往后找指定字符第一次出现的位置，找不到返回-1
    public static void main2(String[] args) {
        String s1 = "asbbisosa";
        System.out.println(s1.indexOf("b"));//2
    }

    //从fromIndex位置开始，往后查找指定字符第一次出现的位置，找不到返回-1
    public static void main3(String[] args) {
        String s1 = "sdkakaacsssd";
        System.out.println(s1.indexOf('d', 3));//11
    }

    //从后往后查找指定字符串第一次出现的位置，找不到返回-1
    public static void main4(String[] args) {
        String s1 = "ansskajdskl";
        System.out.println(s1.indexOf("ds", 2));//7
    }

    //从fromIndex位置开始，向后查找指定字符串第一次出现的位置，找不到返回-1
    public static void main5(String[] args) {
        String s1 = "absddlakskaa";
        System.out.println(s1.indexOf("aa", 2));//10
    }

    //从后往前找指定字符第一次出现的位置,找不到返回-1
    public static void main6(String[] args) {
        String s1 = "absjsjsoaassdd";
        System.out.println(s1.lastIndexOf("a"));//9
    }

    //从fromIndex开始,往前查找指定字符第一次出现的位置,找不到返回-1
    public static void main7(String[] args) {
        String s1 = "ashskskak";
        System.out.println(s1.lastIndexOf('k',3));//8
    }

    //从后往前找指定字符串第一次出现的位置,找不到返回-1
    public static void main8(String[] args) {
        String s1 = "ajskshasjjaa";
        System.out.println(s1.lastIndexOf("as"));//6
    }

    //从fromIndex位置开始，往前查找指定字符串第一次出现的位置，找不到返回-1
    public static void main(String[] args) {
        String s1 = "ajkskaalssl";
        System.out.println(s1.lastIndexOf("aa", 8));//5
    }
}
