package chapter8.polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다. ");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다. ");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다. ");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다. ");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다 ");
    }

    public void flying() {
        System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) { //매개 변수의 자료형이 상위 클래스
        animal.move();                     //재정의 된 메서드 호출

        if (animal instanceof Human) {
            ((Human) animal).readBook();
        } else if (animal instanceof Tiger) {
            ((Tiger) animal).hunting();
        } else if (animal instanceof Eagle) {
            ((Eagle) animal).flying();
        } else {
            System.out.println("지원되지 않는 타입입니다");
        }
    }
}
