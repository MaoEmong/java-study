package ex08;

class Circle3 {
    int radius;

    public Circle3(int radius) {
        this.radius = radius;
    }

    public boolean equals(Circle3 c1) {
        return radius == c1.radius;
    }
}

public class CircleTest3 {
    public static void main(String[] args) {
        Circle3 obj2 = new Circle3(10);
        Circle3 obj1 = new Circle3(10);
        if (obj1.equals(obj2)) System.out.println("두 원은 서로 같습니다");
        else System.out.println("두 원은 서로 다릅니다");

    }
}
