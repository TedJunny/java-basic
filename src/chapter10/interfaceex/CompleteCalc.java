package chapter10.interfaceex;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num, int num2) {
        return num * num2;
    }

    @Override
    public int divide(int num, int num2) {
        if (num2 != 0) {
            return num / num2;
        }
        return ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

    @Override
    public void description() {
        System.out.println("완벽한 계산기 입니다.");
    }
}
