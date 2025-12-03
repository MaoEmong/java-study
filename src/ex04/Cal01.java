package ex04;

// add(+), minus(-), multi(*), divide(/) 완성
public class Cal01 {
    static void Add(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    static void Minus(int a, int b) {
        System.out.println("a-b=" + (a - b));
    }

    static void Multi(int a, int b) {
        System.out.println("a*b=" + (a * b));
    }

    static void Divide(int a, int b) {
        System.out.println("a/b=" + (a / b));
    }


    public static void main(String[] args) {
        // 함수를 호출하는 기본 문법
        // Cal01.add(3, 5);

        // 같은 클래스 안에선 Cal01. 을 생략 가능
        Add(3, 5);
    }
}
