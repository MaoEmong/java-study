package ex06;

public class MyHash02 {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        // 다운캐스팅
        byte b = (byte)c;
        System.out.println(b);
        // 타입 자체가 다르기때문에 강제 캐스팅 필수
        byte b1 = 65;
        char c1 = (char)b1;
        System.out.println(c1);
    }
}
