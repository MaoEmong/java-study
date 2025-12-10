package ex08;

public class Try01 {
    public static void main(String[] args) {
        // throw에 객체를 적으면 해당 메서드를 호출한 시스템에게 에러를 전달한다
        throw new RuntimeException("강제로 예외를 터트림");
    }
}
