package ex16;

public class Th02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("서브 스레드 : " + i);
            }
        });
        t1.start();

        try {
            // t1이 끝날떄 까지 메인스레드 대기
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 200; i++) {
            System.out.println("메인 스레드 : " + i);
        }
    }
}
