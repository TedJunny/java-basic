package chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ted";
        student.address = "서울시 서초구 서초동";

        student.showStudentInfo();
    }
}
