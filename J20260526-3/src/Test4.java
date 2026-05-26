import java.util.Scanner;

/**
 * 删除公共字符
 * 输入两个字符串,从第一字符串中删除第二字符串中所有的字符.
 * 例如,"They are students."和"aeiou",则删除之后的第一个字符串变成"Thy r stdnts"
 */
public class Test4 {
    public String func(String s1,String s2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(!s2.contains(ch + "")) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Test4 test4 = new Test4();
        String result = test4.func(s1,s2);
        System.out.println(result);
    }
}
