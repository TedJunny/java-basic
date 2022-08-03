package chapter6.staticex;

public class Test {
    public static void main(String[] args) {
        Student james = new Student();
        System.out.println(james.studentID);

        Student thomas = new Student();
        System.out.println(thomas.studentID);

        System.out.println(Student.getSerialNum());
    }
}
