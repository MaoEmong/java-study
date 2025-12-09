package ex07;

class Shape2{
    protected int x,y;
}

interface Drawable{
    void draw();
}

class Circle2 extends Shape2 implements Drawable{
    int radius;
    public void draw(){
        System.out.println("Circle Draw at ("+x+", "+y+")");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Drawable obj = new Circle2();
        obj.draw();
    }
}
