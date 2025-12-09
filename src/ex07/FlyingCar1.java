package ex07;

interface Drivable{void drive();}
interface  Flyable{void fly();}

public class FlyingCar1 implements Drivable,Flyable {
    public void drive(){
        System.out.println("Im Driving");
    }
    public void fly()
    {
        System.out.println("Im Flying");
    }

    public static void main(String[] args) {
        FlyingCar1 obj = new FlyingCar1();
        obj.drive();
        obj.fly();
    }
}
