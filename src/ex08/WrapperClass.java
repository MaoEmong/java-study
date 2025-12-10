package ex08;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 100;
        Integer obj = i;
        int value = obj.intValue();
        String s = obj.toString();
        int ival = Integer.parseInt(s);

        obj = 10;
        System.out.println(obj + 1);


    }
}
