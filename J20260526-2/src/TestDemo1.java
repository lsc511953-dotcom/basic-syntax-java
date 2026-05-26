import javax.management.MBeanAttributeInfo;

/**
 * 在这个类讲一下字符串截取和去除字符串两边的空格和判断字符串是否为空
 * 和contains方法和intern方法
 */
public class TestDemo1 {
    public static void main1(String[] args) {
        String s1 = "assakskska";
        String str = s1.substring(2);//从指定下标截取到末尾
        System.out.println(str);

        String str2 = s1.substring(2,4);//在指定区间内截取字符串,前闭后开
        System.out.println(str2);
    }

    //去除左右两边的空格
    public static void main2(String[] args) {
        String s1 = " hello bit ";
        System.out.println("[" + s1 + "]");//[ hello bit ]
        System.out.println("[" + s1.trim() + "]");//[hello bit]
    }

    //判断字符串是否为空
    public static void main3(String[] args) {
        String s1 = "asskalass";
        System.out.println(s1.isEmpty());//false
    }

    //contains方法
    public static void main4(String[] args) {
        String s1 = "ajsjssmd";
        System.out.println(s1.contains("sj"));//true
    }

    //intern方法
    public static void main(String[] args) {
        char[] ch = {'a','b','c'};
        String s1 = new String(ch);
        s1.intern();

        String s2 = "abc";
        System.out.println(s1 == s2);//true
    }
}
