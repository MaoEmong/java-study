package ex08;

import java.io.FileReader;

public class TryTest01 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("test.txt"))
        {
            char[] a = new char[50];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
