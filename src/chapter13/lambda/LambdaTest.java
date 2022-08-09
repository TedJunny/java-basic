package chapter13.lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaStr = str -> System.out.println(str);
        lambdaStr.showString("hello lambda");

        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("hello");
    }

    public static void showMyString(PrintString p) {
        p.showString("hello lambda2");
    }

    public static PrintString returnString() {
        return str -> System.out.println(str + " lambda3");
    }
}
