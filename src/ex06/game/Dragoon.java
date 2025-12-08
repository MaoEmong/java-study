package ex06.game;

public class Dragoon extends Protoss {
    public Dragoon() {
        name = "드라군";
        hp = 100;
        attack = 5;
    }
    public Dragoon(String name, int hp, int attack) {
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
