package chapter10.interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num, int num2);

    int subtract(int num, int num2);

    int times(int num, int num2);

    int divide(int num, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다");
    }

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
