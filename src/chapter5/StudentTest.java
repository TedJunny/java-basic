package chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("ted");
        student.address = "서울시 서초구 서초동";

        student.showStudentInfo();
        System.out.println(student.getStudentName());
    }
}
