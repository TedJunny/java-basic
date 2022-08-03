package chapter7.array;

public class Test {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbersInit = new int[]{0, 1, 2};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbersInit.length);
    }
}
