import java.time.LocalDateTime;

/**
 * 获取年月日时分秒
 */
public class Test4 {
    //获取年月日时分秒
    public static void main1(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.getYear());//获取年
        System.out.println(now.getMonthValue());//获取月
        System.out.println(now.getDayOfMonth());//获取本月第几天
        System.out.println(now.getDayOfWeek().getValue());//获取本周周几
        System.out.println(now.getHour());//获取小时
        System.out.println(now.getMinute());//获取分钟
        System.out.println(now.getSecond());//获取秒数
    }
}
