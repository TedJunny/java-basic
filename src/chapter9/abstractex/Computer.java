package chapter9.abstractex;

// 추상 클래스는 상속을 위해서 만든다.
// 인스턴스화 될 수 없는 속성을 가진다.
public abstract class Computer {
    public abstract void display();

    public abstract void type();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
