package chapter7.array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(array.length);
        System.out.println(array[0].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
