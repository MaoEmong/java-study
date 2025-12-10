package comp;

public class LotteApp {
    public static void main(String[] args) {
        // 1. 버거만 주세요
        Burger b1 = new Burger("기본버거", 1000);
        System.out.println(b1);
        System.out.println();

        // 2. 콜라만 주세요
        Coke c1 = new Coke("코카", 500);
        System.out.println(c1);
        System.out.println();

        // 3. 쉬림프 버거 세트 주세요
        BurgetSet set = new BurgetSet(
                new ShrimpBurger("새우버거",2000,"새우"),
                new Coke("펩시",500),
                new Potato("감자튀김", 1500)
        );

        System.out.println(set.getTotalPrice());

    }
}
