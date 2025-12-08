package ex06.game;

// 오버로딩
public class GameApp {
    static void start(Protoss p1, Protoss p2) {
        System.out.println(p1.getName() + "의 공격 => 데미지 : " + p1.getAttack());
        p2.getDamage(p1.getAttack());
        System.out.println(p2.getName() + "의 남은 체력 : " + p2.getHp());
        System.out.println();
    }

    public static void main(String[] args) {
        Protoss z1 = new Zealot();
        Protoss d1 = new Dragoon();
        Protoss r1 = new River();

        start(z1, d1);
        start(d1, r1);
        start(r1, z1);
    }
}