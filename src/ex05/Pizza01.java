package ex05;

public class Pizza01 {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Pizza01(String toppings)
    {
        this.toppings = toppings;
        count++;
    }
}
