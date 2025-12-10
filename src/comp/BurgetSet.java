package comp;

/*
1. is a => 상속
2. can do => 인터페이스
3. has a => 결합(Composite) -> 상태로 가지면 됨
 */

public class BurgetSet {
    Burger burger;
    Coke coke;
    Potato potato;

    public BurgetSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public int getTotalPrice()
    {
        int totalPrice = burger.getPrice() + coke.getPrice() + potato.getPrice();
        totalPrice = (int)(totalPrice * 0.9);
        return totalPrice;
    }
}
