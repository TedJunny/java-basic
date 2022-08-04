package chapter9.template;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public abstract void wipe();

    // 후크 메소드
    public void washCar() {}

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOffCar() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() {
        startCar();
        drive();
        wipe();
        stop();
        turnOffCar();
        washCar();
    }
}
