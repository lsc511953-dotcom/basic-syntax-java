import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * 复习一下BigDecimal类
 */
public class Test {
    //BigDecimal的创建方式
    //因为double不能精确表示许多小数，所以用BigDecimal的时候误差也会留下来
    //所以开发中创建小数类型的BigDecimal时，推荐使用字符串
    public static void main1(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(123);
        BigDecimal bigDecimal2 = new BigDecimal(3.14);
        BigDecimal bigDecimal3 = new BigDecimal("1.99");

        System.out.println(bigDecimal);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);
    }

    //进行加减乘运算
    public static void main2(String[] args) {
        BigDecimal a = new BigDecimal("1.33");
        BigDecimal b = new BigDecimal("3.45");
        //相加
        BigDecimal result = a.add(b);
        System.out.println(result);//4.78
        //相减
        BigDecimal result2 = a.subtract(b);
        System.out.println(result2);//-2.12
        //相乘
        BigDecimal result3 = a.multiply(b);
        System.out.println(result3);//4.5885
    }

    //进行除法时要指定精度和舍入模式
    public static void main3(String[] args) {
        BigDecimal a = new BigDecimal("1.23");
        BigDecimal b = new BigDecimal("3.45");
        BigDecimal result = a.divide(b,2, RoundingMode.HALF_UP);
        System.out.println(result);//0.36
    }

    //除了在 divide() 方法中直接指定小数位数，也可以使用 MathContext 控制运算精度。
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("2.34");
        BigDecimal b = new BigDecimal("3.56");

        //注意这里的精度是有效小数位数
        BigDecimal result = a.divide(b,new MathContext(2,RoundingMode.HALF_UP));
        System.out.println(result);//0.66
    }
}
