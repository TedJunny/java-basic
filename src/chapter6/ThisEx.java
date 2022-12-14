package chapter6;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        // 자신의 메모리를 가리킨다
        System.out.println(this);
    }
}

public class ThisEx {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();

        System.out.println(b2);
        b2.printThis();
    }
}
