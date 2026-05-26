/**
 * 验证回文串
 * 如果在将所有大写字母转换为小写字母.并移除所有非字母数字字符之后
 * 短语正着读和反着读都一样,可以认为该短语是一个回文串
 * 字母和数字都属于字母数字字符
 * 给你一个字符串s,如果他是回文串,返回true;否则.返回false
 */
public class Test3 {
    public boolean isPalindrome(String s) {
        s.toLowerCase();//转换为小写
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            //比较
            if(!(s.charAt(i) == s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "race a car";
        Test3 test = new Test3();
        Boolean result = test.isPalindrome(s1);
        if(result) {
            System.out.println("字符串是回文串");
        }else{
            System.out.println("字符串不是回文串");
        }
    }
}
