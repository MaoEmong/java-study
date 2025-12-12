package ex16;

class Hello implements Runnable{

    // sub thread
    @Override
    public void run() {
        for(int i = 0 ; i < 100; i++)
            System.out.println("sub 스레드 : "+ i);

        System.out.println("sub 스레드 종료");
    }
}

public class Th01 {

    // main 스레드
    public static void main(String[] args) {
        System.out.println("첫번째 실행");
        System.out.println("두번째 실행");
        System.out.println("세번째 실행");
        Hello hello = new Hello();
        Thread sub = new Thread(hello);
        sub.start();    // run 메서드가 새로운 작업단위가 된다
        for(int i = 0 ; i < 100; i++)
            System.out.println("main 스레드 : "+ i);

        System.out.println("main 스레드 종료");

    }
}
