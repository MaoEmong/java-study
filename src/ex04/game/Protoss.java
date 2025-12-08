package ex04.game;

abstract public class Protoss {
    String name;
    int hp;
    int attack;

    void getDamage(int damage)
    {
        hp -= damage;
        if(hp < 0)hp = 0;
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
