package ex08.ch01;

// checked exception
// unChecked exeption
public class CheckTry {

    static void m1() throws Exception {
        throw new Exception("강제로 던진 Checked Exception");
    }

    static void m2() {
        throw new RuntimeException("강제로 던진 Unchecked Exception");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        m2();
    }
}
