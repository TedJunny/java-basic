package chapter13.innerclass;

class Outer2 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);

            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 outClass = new Outer2();
        Runnable runnable = outClass.getRunnable(10);
        runnable.run();

        outClass.runner.run();
    }
}
