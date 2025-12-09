package ex07;

// 추상 클래스
abstract class 판사 {
    // 구체적인 행위가 오브젝트마다 다를때
    public abstract void 심문();

    public void 종료(){
        System.out.println("모든 판사는 심문을 종료한다");
    }
}

class 왕 extends 판사 { // 판사 is a 왕
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다.");
    }
}

abstract class 증인 {
    String name;

    public void 대답() {
        System.out.println(name + "은 대답한다");
    }
    public abstract void move();
}

class 모자장수 extends 증인 {
    public 모자장수(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("모자장수는 앞으로 이동한다");
    }
}

class 엘리스 extends 증인 {
    public 엘리스(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("엘리스는 뒤로 이동한다");
    }
}
// 객체지향 1원칙
// 상태는 행위를 통해 변경한다

public class AliceApp {
    public static void main(String[] args) {
// 1. 초기화
         증인 c1 = new 모자장수("모자장수");
         증인 c2 = new 엘리스("엘리스");
         판사 c3 = new 왕();
         판사 c4 = new 왕비();

         // 2. 실행
        c1.대답();
        c2.대답();
        c3.심문();
        c4.심문();
        c3.종료();
        c4.종료();
    }
}
