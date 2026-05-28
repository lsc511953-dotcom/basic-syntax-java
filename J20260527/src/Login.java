
/**
 * 这里以登录为例讲一下自定义异常
 * 这里要定义两个异常,一个是用户名错误异常,另一个是密码错误异常
 * 因为我们输入的是String类型的数据,所以比较是否是同一个东西得用equals
 */
public class Login {
    public String username = "bit";
    public String password = "1234";

    //写一个方法进行判断
    public void loginInfo(String username,String password) {
        if(!(this.username.equals(username))) {
            throw new UsernameException("用户名输入错误,您输入的用户名为: " + username);
        }

        if(!(this.password.equals(password))) {
            throw new PasswordException("密码输入错误,您输入的密码为: " + password);
        }

        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.loginInfo("bit","1234");
    }

}

class UsernameException extends RuntimeException{
    public UsernameException(String message) {
        super(message);
    }
}

class PasswordException extends RuntimeException{
    public PasswordException(String message) {
        super(message);
    }
}