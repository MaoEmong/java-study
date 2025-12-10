package ex08;

import java.io.FileReader;

public class ExceptionTest {
    // throws 예외가 발생하면 상위 메서드로 예외를 던져서 처리하겠다는 의미
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("test.txt");
        char[] a = new char[50];
        fr.read(a);
        for(var c : a)
            System.out.print(c);
    }
}
