/**
 * 字符串中的第一个唯一字符
 *给定一个字符串s,找到它的第一个不重复的字符,并返回它的索引.如果不存在,则返回-1
 */
public class Test {
    //解决这个问题,我想到的思路是
    //先用数组统计每个字母出现的次数，再从左到右遍历字符串，找到第一个出现次数为 1 的字符并返回下标。
    public int firstUniqueChar(String s) {
        int[] count = new int[26];//定义整形数组,默认初始化为0

        //第一次遍历,统计字符出现次数
        for(int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            count[ch - 97]++;
        }

        //第二次遍历,找到第一个出现次数为1的字符并返回下标
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(count[ch - 97] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "aabb";
        Test test = new Test();
        int result = test.firstUniqueChar(s1);
        if(result == -1) {
            System.out.println("在这个字符串中没找到不重复的字符");
        }else{
            System.out.println("在这个字符串中找到了不重复的字符,它的第一个不重复字符的索引是: " + result);
        }
    }
}
