import java.time.LocalDateTime;

/**
 * 日期运算
 */
public class Test3 {
    public static void main1(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus = now.plusYears(1);
        LocalDateTime minus = now.minusYears(1);

        System.out.println(plus);
        System.out.println(minus);
    }

    public static void main2(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus = now.plusMonths(1);
        LocalDateTime minus = now.minusYears(1);

        System.out.println(plus);
        System.out.println(minus);
    }

    public static void main3(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus = now.plusDays(1);
        LocalDateTime minus = now.minusDays(1);

        System.out.println(plus);
        System.out.println(minus);
    }

    public static void main4(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus = now.plusHours(1);
        LocalDateTime minus = now.minusHours(1);

        System.out.println(plus);
        System.out.println(minus);
    }

    public static void main5(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus = now.plusMinutes(1);
        LocalDateTime minus = now.minusMinutes(1);

        System.out.println(plus);
        System.out.println(minus);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus = now.plusSeconds(1);
        LocalDateTime minus = now.minusMinutes(1);

        System.out.println(plus);
        System.out.println(minus);
    }
}
