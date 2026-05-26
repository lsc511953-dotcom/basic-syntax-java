/**
 * 这里讲一下数值与字符串的转换
 */
public class TestDemo2 {
    public static void main1(String[] args) {
        //数值转换为字符串
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(10L));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(2.34));
        System.out.println(String.valueOf(2.34f));
        System.out.println(new Student(10,"小明"));

        //字符串转换为数值
        int a = Integer.parseInt("1233");
        long l = Long.parseLong("1234542");
        boolean b = Boolean.parseBoolean("false");
        double d = Double.parseDouble("3.14");
        float f = Float.parseFloat("2.24f");
    }

    //大小写转换
    public static void main(String[] args) {
        String s1 = "asdaa";
        String s2 = "ASKSKAL";
        System.out.println(s1.toUpperCase());//ASDAA
        System.out.println(s2.toLowerCase());//askskal
    }
}

class Student{
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}