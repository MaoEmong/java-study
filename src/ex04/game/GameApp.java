package ex04.game;

// 오버로딩
public class GameApp {

//    // u1 -> u2 공격
//    static void Start(Zealot u1, Dragoon u2) {
//        u2.hp = u2.hp - u1.attack;
//    }
//
//    static void Start(Dragoon u1, Zealot u2){
//        u2.hp = u2.hp - u1.attack;
//    }
//
//    static void Start(Zealot u1, Zealot u2){
//        u2.hp = u2.hp - u1.attack;
//    }

    static void start(Protoss p1, Protoss p2) {
        System.out.println(p1.getName() + "의 공격 데미지 : " + p1.getAttack());
        p2.getDamage(p1.getAttack());
        System.out.println(p2.getName() + "의 남은 체력 : " + p2.getHp());
        System.out.println();
    }

    public static void main(String[] args) {
//        Zealot z1 = new Zealot();
//        Zealot z2 = new Zealot();
//        Dragoon d1 = new Dragoon();
//
//        Start(z1, d1);
//        // 1. 드라군의 상태 확인
//        System.out.println(d1.hp);
//
//        Start(d1, z1);
//        // 2. 질럿1의 상태 확인
//        System.out.println(z1.hp);
//
//        // 3. 질럿2의 상태 확인
//        Start(z1,z2);
//        System.out.println(z2.hp);
//
//        System.out.println();
//        System.out.println(1);
//        System.out.println(" ");
//        System.out.println(1.2);
//        System.out.println(true);

        Protoss z1 = new Zealot();
        Protoss d1 = new Dragoon();
        Protoss r1 = new River();

        start(z1, d1);
        start(d1, r1);
        start(r1, z1);
    }
}
