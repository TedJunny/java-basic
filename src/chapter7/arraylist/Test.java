package chapter7.arraylist;

public class Test {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("======================================");
        studentKim.showStudentInfo();
    }
}
