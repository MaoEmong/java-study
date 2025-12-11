package ex13;

/*
Object로 설계할 수 밖에 없는 이유

 */

class 서랍 {

    Object data;

    static 서랍 instance = new 서랍();

    private 서랍() {

    }
}

public class Ge03 {
    public static void main(String[] args) {
        서랍 s = 서랍.instance;
        s.data = "Hello";

        // 다운 캐스팅
        String castData = (String) s.data;
        int len = castData.length();
        System.out.println(len);
    }
}