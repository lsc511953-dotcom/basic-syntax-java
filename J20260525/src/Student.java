import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用Comparator接口和Comparable接口进行对象的比较
 */
public class Student implements Comparable<Student>{
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

    //比较年龄
    /*@Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }*/

    //比较姓名
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class TestDemo{
    public static void main1(String[] args) {
        Student student = new Student(10,"小林");
        Student student2 = new Student(10,"张三");

        if(student.compareTo(student2) > 0) {
            System.out.println("student > student2");
        }else if(student.compareTo(student2) < 0){
            System.out.println("student < student2");
        }else{
            System.out.println("student = student2");
        }
    }

    //用Comparable接口排序数组元素
    public static void main2(String[] args) {
        Student student = new Student(10,"wangwu");
        Student student2 = new Student(11,"lisi");
        Student student3 = new Student(12,"zs");

        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;

        System.out.println("排序前数组: " + Arrays.toString(students));
        Arrays.sort(students);//开始排序
        System.out.println("排序后数组: " + Arrays.toString(students));
    }

    public static void main(String[] args) {
        Student student = new Student(10,"wangwu");
        Student student2 = new Student(11,"lisi");
        Student student3 = new Student(12,"zs");

        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;

        AgeComparator ageComparator = new AgeComparator();

        System.out.println("排序前数组: " + Arrays.toString(students));
        Arrays.sort(students,ageComparator);
        System.out.println("排序后数组: " + Arrays.toString(students));

        NameComparator nameComparator = new NameComparator();

        System.out.println("排序前数组: " + Arrays.toString(students));

        Arrays.sort(students,nameComparator);

        System.out.println("排序后数组: " + Arrays.toString(students));
    }
}
