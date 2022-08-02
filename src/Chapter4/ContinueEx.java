package Chapter4;

public class ContinueEx {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 2 == 1) {
                continue;
            }
            total += i + 1;
        }

        System.out.println(total);
    }
}
