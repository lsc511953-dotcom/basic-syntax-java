import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 * 对于给定的若干个单词组成的句子,每个单词均由大小写字母混合构成,单词使用单个空格分割.
 * 输出最后一个单词的长度
 * 在一行上输入若干个字符串,每个字符串代表一个单词,组成给定的句子
 * 除此之外,保证每个单词非空,由大小写字母混合构成
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {//注意要用hasNestLine,不然遇到空格就结束了
            String str = scanner.nextLine();//输入字符串
            //解决这个问题,有两个方法
            //方法一:截取字符串
            /*int index = str.lastIndexOf(" ");//找到最后一个单词的位置
            String result = str.substring(index + 1);//截取完最后一个单词
            System.out.println(result.length());*/

            //方法二:拆分字符串
            String[] str2 = str.split(" ");
            //找到最后一个单词
            int result = str2[str2.length - 1].length();
            System.out.println(result);
        }
    }
}
