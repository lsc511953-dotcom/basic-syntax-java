import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 根据当前时间获取指定日期
 */
public class Test2 {

    //获取本周周一和本周周日
    public static void main2(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.with(DayOfWeek.MONDAY));
        System.out.println(now.with(DayOfWeek.SUNDAY));
    }

    //获取本月第一天和本月最后一天
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.withDayOfMonth(1));//获取本月第一天
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));//获取本月最后一天
    }

}
