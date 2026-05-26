/**
 * 在这个类讲一下StringBuilder
 */
public class TestDemo2 {
    public static void main1(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //常用方法 append
        stringBuilder.append("abc").append("def");//可以链式调用
        stringBuilder.append("gh");//也可以不链式调用
        System.out.println(stringBuilder);//abcdefgh
    }

    public static void main2(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdef").append("ghjkl");
        //常用方法reverse
        System.out.println(stringBuilder.reverse());//lkjhgfedcba
    }

    public static void main3(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asdfghjkl");
        //常用方法delete
        System.out.println(stringBuilder.delete(2, 5));//ashjkl
    }

    public static void main4(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asdfg");
        //常用方法insert
        System.out.println(stringBuilder.insert(5, "hjkl"));//asdfghjkl
    }

    public static void main5(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("absskakal");
        //常用方法charAt
        System.out.println(stringBuilder.charAt(3));//s
    }

    //在这里讲一下StringBuilder与字符串的相互转换
    public static void main(String[] args) {
        //字符串转换为StringBuilder有两种方式
        String s1 = "akslaks";
        //方式一
        StringBuilder stringBuilder = new StringBuilder("absja");
        //方式二
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("aslala");

        //StringBuilder转换为字符串
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder.append("asdfghjkl");
        String s2 = stringBuilder.toString();
    }


}
