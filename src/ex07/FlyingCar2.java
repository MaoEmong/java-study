package ex07;

interface Flyable2 {
    void fly();
}

class Car {
    int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class FlyingCar2 extends Car implements Flyable2 {
    public void fly() {
        System.out.println("Im Flying!");
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        obj.fly();
    }
}
