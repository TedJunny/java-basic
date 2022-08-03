package chapter6.staticex;

public class Student {
    private static int serialNum = 10000;
    int studentID;
    String name;

    public Student() {
        serialNum++;
        this.studentID = serialNum;
    }

    public static int getSerialNum() {
        int i = 10; // 지역변수. 메소드 호출 시 생성

        // this.name = "홍길동";  멤버변수. 인스턴스 변수
        // ( 객체가 생성되어야지만 사용할 수 있어 static context 에서는 사용할 수 없다.)

        return serialNum;
    }
}
