package ex04;

public class Burger {
    String material1;
    String material2;
    String material3;
    int price;

    Burger(){
        material1 = "빵";
        material2 = "토마토";
        material3 = "베이컨";
        price = 7000;
    }
    Burger(String m1)
    {
        material1 = m1;
        material2 = "토마토";
        material3 = "베이컨";
        price = 7000;
    }
    Burger(String m1, String m2)
    {
        material1 = m1;
        material2 = m2;
        material3 = "베이컨";
        price = 7000;
    }
    Burger(String m1, String m2, String m3)
    {
        material1 = m1;
        material2 = m2;
        material3 = m3;
        price = 7000;
    }
    Burger(String m1, String m2, String m3, int pc)
    {
        material1 = m1;
        material2 = m2;
        material3 = m3;
        price = pc;
    }
    Burger(Builder build)
    {
        material1 = build.material1;
        material2 = build.material2;
        material3 = build.material3;
        price = build.price;
    }

    void printMaterial()
    {
        System.out.println(material1);
        System.out.println(material2);
        System.out.println(material3);
        System.out.println(price);
    }

    static class Builder
    {
        String material1;
        String material2;
        String material3;
        int price;

        Builder(){}

        Builder setMaterial1(String m1)
        {
            material1 = m1;
            return this;
        }
        Builder setMaterial2(String m2)
        {
            material2 = m2;
            return this;
        }
        Builder setMaterial3(String m3)
        {
            material3 = m3;
            return this;
        }
        Builder setPrice(int pc)
        {
            price = pc;
            return this;
        }
        Burger build()
        {
            return new Burger(this);
        }
    }

    public static void main(String[] args) {
        Burger bg = new Burger.Builder().
                setMaterial1("빵").
                setMaterial2("양상추").
                setMaterial3("토마토").
                setPrice(7000).
                build();

        bg.printMaterial();
    }
}
