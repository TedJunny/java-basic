package chapter6;

public class Bus {
    int number;
    int passengerCount;
    int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("버스 " + number + "번의 승객은 " + passengerCount +
                "명이고, 수입은 " + money + "입니다");
    }
}
