package ex06.game;

public class Zealot extends Protoss {
    public Zealot() {
        name = "질럿";
        hp = 100;
        attack = 10;
    }
    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
}
