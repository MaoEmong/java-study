package ex04;

public class Tv01 {

    boolean status = false; // 상태

    void on(){
        System.out.println("tv가 켜졌어요");
        status = true;  // 상태 변경
    }

    void off(){
        System.out.println("tv가 꺼졌어요");
        status = false;  // 상태 변경
    }

    public static void main(String[] args) {
        Tv01 tv = new Tv01();   // 객체(Object) 생성
        System.out.println(tv.status);

        tv.on();
        System.out.println(tv.status);

        tv.off();
        System.out.println(tv.status);

    }
}
