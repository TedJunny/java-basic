package chapter3;

public class OperationEx5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = num1 | num2;
        System.out.println(result);

        int num3 = 5; // 0000 0101;
        System.out.println(num3 << 3); // 5 * 2^3
        System.out.println(num3 >> 1); // 5 / 2^1
    }
}
