/**
 * 复习一下try-catch-finally
 * try包裹可能出现异常的代码
 * catch捕获和处理
 * finally关闭资源,关闭文件,关闭连接
 * finally块在方法返回时执行
 * 不建议在finally块中写return,如果try块中有return
 * finally块中的return会覆盖try中的return
 */
public class Test3 {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            System.out.println("这里一般关闭资源,关闭连接,关闭文件");
        }
    }
}
