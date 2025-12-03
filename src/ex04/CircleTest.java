package ex04;


public class CircleTest {
    public static void main(String[] args) {
        Circle obj;
        obj = new Circle();
        obj.radius = 100;
        obj.color = " Blue";
        double area = obj.getArea();
        System.out.println("원의 면적 : "+area);
    }
}
