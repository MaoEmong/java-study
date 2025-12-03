package z_myfolder;

public class FactoryPattern {
    // 무기 인터페이스 클래스
    interface Weapon {
        void attack();
    }

    // 검 : 무기
    static class Sword implements Weapon {
        public void attack() {
            System.out.println("Sword 공격!");
        }
    }

    // 활 : 무기
    static class Bow implements Weapon {
        public void attack() {
            System.out.println("Bow 공격!");
        }
    }

    static abstract class Charactor {
        String name = "캐릭터";

        protected abstract Weapon CreateWeapon();

        public void StartBattle() {
            Weapon weapon = CreateWeapon();
            System.out.println(name + "전투시작");
            weapon.attack();
        }
    }

    static class Warrior extends Charactor {
        public Warrior() {
            name = "워리어";
        }

        @Override
        protected Weapon CreateWeapon() {
            return new Sword();
        }
    }

    static class archer extends Charactor {
        public archer() {
            name = "아처";
        }

        @Override
        protected Weapon CreateWeapon() {
            return new Bow();
        }
    }


    public static void main(String[] args) {
        Charactor warrior = new Warrior();
        Charactor archer = new archer();

        warrior.StartBattle();
        archer.StartBattle();

    }
}