/**
 * 复习一下异常的抛出throw
 */
public class Test {
    public static int getElement(int[] array,int index) {
        if(array == null) {
            throw new NullPointerException("数组不能为null");
        }

        if(index > array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }

        return array[index];
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int result = getElement(array,3);
        System.out.println(result);
    }
}
