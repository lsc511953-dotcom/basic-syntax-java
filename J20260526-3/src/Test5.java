import java.util.Scanner;

/**
 * 字符串加法
 * 输入两个字符串a和b,字符串内容为二进制数字，求两个字符串相加的结果
 * 加法计算方式以二进制方式计算，并返回对应的字符串结果
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String result = add(s1,s2);
            System.out.println(result);
        }
    }

    public static String add(String s1,String s2) {
        //存储逐位计算的结果(逆序)
        StringBuilder stringTemp = new StringBuilder();

        //逆置两个字符串
        StringBuilder stringBuilderA = new StringBuilder(s1).reverse();
        StringBuilder stringBuilderB = new StringBuilder(s2).reverse();
        
        //计算两个字符串的长度
        int lenA = s1.length();
        int lenB = s2.length();

        //计算两个字符串的最大值
        int max = (lenA - lenB > 0) ? lenA : lenB;

        boolean isCarry = false;//进位标志符

        //开始遍历
        for (int i = 0; i < max; i++) {
            //处理补0
            char cha = (i >= lenA) ? '0' : stringBuilderA.charAt(i);
            char chb = (i >= lenB) ? '0' : stringBuilderB.charAt(i);

            if(cha == '0' && chb == '0') {
                if(isCarry) {
                    stringTemp.append('1');
                }else{
                    stringTemp.append('0');
                }
                isCarry = false;
            }else if(cha == '1' && chb == '1') {
                if(isCarry) {
                    stringTemp.append('1');
                }else{
                    stringTemp.append('0');
                }
                isCarry = true;
            }else{
                if(isCarry) {
                    stringTemp.append('0');
                }else{
                    stringTemp.append('1');
                }
            }
        }
        
        if(isCarry) {
            stringTemp.append('1');
        }

        return stringTemp.reverse().toString();
    }
}
