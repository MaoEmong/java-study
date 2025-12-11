package ex13;

// 오브젝트의 장단점
class Box{
    Object data;
}

public class Ge01 {
    public static void main(String[] args) {
        Box box = new Box();
        box.data = "Hello";

        String castData = (String)box.data;

        int len = castData.length();
    }
}
