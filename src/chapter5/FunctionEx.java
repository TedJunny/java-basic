package chapter5;

public class FunctionEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        // 자바에서 함수 호출을 할 때 스택 메모리를 사용하게 된다.
        int sum = addNum(num1, num2);

        // 함수의 기능이 끝나면 메모리 반환.
        System.out.println(sum);
    }

    public static int addNum(int n1, int n2) {
        return n1 + n2;
    }
}
