package ex06.example;

class Shape {
    void draw() {
        System.out.println("도형을 그립니다");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("원을 그립니다");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("사각형을 그립니다");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("삼각형을 그립니다");
    }
}


public class Ex01 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for(int i = 0 ; i < shapes.length; i++)
        {
            shapes[i].draw();
        }
    }
}
