package ex08;

class Circle
{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
}

public class CircleTest2 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(10);
        Circle obj2 = new Circle(10);
        if(obj1 == obj2) System.out.println("2개의 원은 서로 같습니다");
        else System.out.println("2개의 원은 서로 다릅니다");
    }
}
