package ex05;

public class Test01 {
    public static int cube(int x)
    {
        int result = x * x * x;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("10 * 10 * 10 = " + cube(10));
    }
}
