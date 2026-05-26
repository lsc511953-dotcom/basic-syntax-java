/**
 * 在这个类讲一下字符串的替换
 */
public class TestDemo4 {
    public static void main(String[] args) {
        String s1 = "asdfghjklaad";
        //把指定的旧字符替换为新指定字符,注意是生成新的字符串对象
        System.out.println(s1.replace('a', 's'));//ssdfghjklssd

        String s2 = "aassddffgghjkl";
        //把指定的旧字符串替换为新指定字符串
        System.out.println(s2.replace("ss", "aa"));//aaaaddffgghjkl

        String s3 = "aaaassddffgg";
        //把指定的旧字符串第一次出现的位置替换成新指定字符串
        System.out.println(s3.replaceFirst("aa", "ss"));//ssssddffgg

        String s4 = "aaaaabbbbbbbb";
        System.out.println(s4.replaceAll("bb", "aa"));//aaaaaaaaaaaaa
    }
}
