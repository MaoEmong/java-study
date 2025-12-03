package ex04;

// add(+), minus(-), multi(*), divide(/) 완성
public class Cal02 {
    static int Add(int a, int b) {
        return a + b;
    }

    static int Minus(int a, int b) {
        return a - b;
    }

    static int Multi(int a, int b) {
        return a * b;
    }

    static int Divide(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        int r1 = Add(3, 5);
        int r2 = Minus(3, 5);
        int r3 = Multi(3, 5);
        int r4 = Divide(3, 5);

        System.out.println(r1 + r2 + r3 + r4);
    }
}
