package JVM;

public class Stack01 {

    static void m1(int a) {
        int b = 10;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    static void m2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    static void m3() {
        System.out.println("m3 호출됨");
        int num = 1;
        m3();
    }

    public static void main(String[] args) {
        System.out.println("메인 시작");
        m1(5);
        m2();
        {
        int a = 10;
        }
        int a = 0;
        System.out.println("메인 끝");
    }
}
