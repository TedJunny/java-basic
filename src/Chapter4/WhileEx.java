package Chapter4;

public class WhileEx {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

        num = 1;
        sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 10); // 조건을 나중에 체크하기 때문에 한 번은 수행문이 수행됨.
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
