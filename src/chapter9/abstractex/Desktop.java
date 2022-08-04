package chapter9.abstractex;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("Desktop display()");
    }

    @Override
    public void type() {
        System.out.println("Desktop type()");
    }
}
