package ex01;

public class Var01 {
    public static void main(String[] args) {
        // 1바이트 -128 ~ 127
        byte a1 = 100;
        // 4바이트 -21억 ~ 21억
        int a2 = 2000000000;
        // 8바이트 실수형
        double a3 = 1.5;
        // 1비트 true/false
        boolean a4 = true;
        System.out.println(a1 + a2 + a3);
    }
}