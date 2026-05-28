/**
 * 复习一下异常的声明
 */
public class Test2{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student = new Student(10,"小明");
        Student student2 = (Student)student.clone();
        System.out.println(student.age);
        System.out.println(student.age);
    }
}

class Student implements Cloneable{
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //throws 声明异常,一般只有编译时异常会声明
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}