package ex13;

import java.util.HashMap;

// new 할때 타입을 결정할 수 있게 해주는 제네릭
class Box2<T> {
    T data;
}

public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2<>();
        box2.data = "Hello";

        String val = box2.data;
        int len = box2.data.length();
        System.out.println(box2.data);

        Box2<Integer> box3 = new Box2<>();
        box3.data = 10;
        System.out.println(box3.data);

    }
}
