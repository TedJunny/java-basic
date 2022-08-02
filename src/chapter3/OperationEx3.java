package chapter3;

public class OperationEx3 {
    public static void main(String[] args) {
        int num = 10;
        int i = 2;

        boolean value = (((num += 10) < 10) && ((i += 2) > 10));
        System.out.println(value);
        System.out.println(num);
        System.out.println(i); // 첫 항의 결과가 false 이기 때문에 뒷 항이 계산되지 않음
    }
}
