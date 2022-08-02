package chapter5;

public class Student {
    int studentId;
    private String name;
    int grade;
    String address;

    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(name+ ", " + address);
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }
}
