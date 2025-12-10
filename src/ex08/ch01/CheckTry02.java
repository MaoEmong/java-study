package ex08.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckTry02 {

    // 예상 불가능한 예외(런타임 익셉션)
    static void m1(int n) {
//        // 유효성 검사
//        if( n == 0)
//        {
//            System.out.println("0 입력 불가");
//            return;
//        }
        try {
            int result = 10 / n;
            System.out.println(result);
        } catch(RuntimeException e) {
            System.out.println("0");
        }
    }

    // 예상 가능한 예외(런타임 익셉션이 아닌 모든 익셉션)
    static void m2() {
        try {
            FileInputStream fis = new FileInputStream("파일명");
        } catch (FileNotFoundException e) {
            System.out.println("파일명을 찾지 못함");
        }
    }

    public static void main(String[] args) {
        m1(0);
        m2();
    }
}
