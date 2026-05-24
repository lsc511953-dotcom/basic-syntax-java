package test1;

/**
 * 在这个类讲一下就地初始化
 */
public class Date {
    public int year = 2025;
    public int month = 5;
    public int day = 3;

    public void print() {
        System.out.println("year: " + this.year + " month: " + this.month + " Day: " + this.day);
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.print();
    }
}
