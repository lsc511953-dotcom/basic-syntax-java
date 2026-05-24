package test1;

/**
 * 讲一下用构造方法初始化变量和构造方法重载
 */
public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("执行带三个参数的构造方法");
    }

    public MyDate() {
        System.out.println("执行不带参数的构造方法");
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate(2026,5,23);
        MyDate myDate1 = new MyDate();
        System.out.println(myDate.toString());
    }
}
