package ex06.game;

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
        return "";
    }

    public void setName(String name) {}

    public int getHp() {
        return 0;
    }

    public void setHp(int hp) {}

    public int getAttack() {return 0;}

    public void setAttack(int attack){}
}
