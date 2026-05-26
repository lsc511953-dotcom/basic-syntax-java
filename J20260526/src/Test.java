/**
 * 字符串的三种构造方式
 *
 */
public class Test {
    //字符串的三种构造方式
    public static void main1(String[] args) {
        String s1 = "dsjdd";//第一种构造方式
        String s2 = new String("ssa");//第二种构造方式
        char[] ch = {'s','s','a'};
        String s3 = new String(ch);//第三种构造方式
    }

    //字符串的内存存储第一种
    public static void main2(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true;
    }

    //字符串的内存存储第二种
    public static void main3(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
    }

    //字符串的内存存储第三种
    public static void main4(String[] args) {
        String s1 = "abc";
        char[] ch = {'a','b','c'};
        String s2 = new String(ch);
        System.out.println(s1 == s2);//false
    }

    //字符串的比较
    //用equals比较,返回boolean类型
    public static void main5(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = " hel";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(s4));//false
    }

    //字符串的比较
    //用compareTo,与equals不同的是equals返回的是boolean类型,而compareTo返回的是int类型
    // 它们都是按字典符大小顺序比较
    public static void main6(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = "hel";

        System.out.println(s1.compareTo(s2));//字符串的大小相等,返回0
        System.out.println(s1.compareTo(s3));//返回Unicode差值,32
        System.out.println(s1.compareTo(s4));//返回长度差值,2
    }

    //这次也是比较字符串的大小,也是返回int类型,不过这次不考虑字符串的大小写
    //用compareToIgnoreCase
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";
        String s4 = "hel";

        System.out.println(s1.compareToIgnoreCase(s1));//0
        System.out.println(s1.compareToIgnoreCase(s3));//0,这次不考虑大小写,除了大小写,其他相同,所以这次返回0
        System.out.println(s1.compareToIgnoreCase(s4));//2
    }

}
