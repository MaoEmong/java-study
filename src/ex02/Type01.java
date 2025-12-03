package ex02;

public class Type01 {
    public static void main(String[] args) {
        // +, -, *, / 4칙연산 코드
        int a1 = 10; // 4Byte
        double a2 = 1.2; // 8Byte
        double sum1 = a1 + a2;

        System.out.println(sum1);

        int sum2 = (int) a2; // 명시적 형변환 / 다운캐스팅
        System.out.println(sum2);

        double sum3 = a1; // 묵시적 형변환 / 업캐스팅
        System.out.println(sum3);

        byte a3 = (byte) 300;
        System.out.println(a3);
    }
}
