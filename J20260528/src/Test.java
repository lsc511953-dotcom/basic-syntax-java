import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 在这里复习一下创建LocalDateTime类对象
 * LocalDateTime类的构造方法是用private修饰的,所以只能用
 * LocalDateTime类的静态方法来创建对象
 */
public class Test {
    public static void main1(String[] args) {
        //方法一:获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        //方法二:创建指定时间
        LocalDateTime localDateTime2 = LocalDateTime.of(2023,2,3,4,3,2);
        //方法三:将字符串解析成LocalDateTime对象
        LocalDateTime localDateTime1 = LocalDateTime.parse("2024-03-04T10:34:04");
    }

    //在这里讲一下自定义格式解析日期时间
    //LocalDateTime.parse()默认解析ISO-8603标准格式,日期与时间之间需要用T连接
    //自定义格式需要借助DateTimeFormatter
    public static void main2(String[] args) {
        String str = "2025年02月13日 10:23:34";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(str,formatter);
        System.out.println(localDateTime);
    }

    //LocalDateTime对象转成字符串
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //使用DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String str = now.format(formatter);
        System.out.println(str);
    }
}
