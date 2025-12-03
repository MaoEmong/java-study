package ex03;

public class Exam05 {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";

        // 1차풀이
        System.out.println("1차");
        // 1행 (space, space, star)
        System.out.print(space);
        System.out.print(space);
        System.out.print(star);
        System.out.println();
        // 2행 (space, star, star)
        System.out.print(space);
        System.out.print(star);
        System.out.print(star);
        System.out.println();
        // 3행 (star, star, star)
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.println();

        System.out.println("======================");
        // 2차풀이
        System.out.println("2차");
        // 1행
        for (int i = 0; i < 2; i++)
            System.out.print(space);
        for (int i = 0; i < 1; i++)
            System.out.print(star);
        System.out.println();
        // 2행
        for (int i = 0; i < 1; i++)
            System.out.print(space);
        for (int i = 0; i < 2; i++)
            System.out.print(star);
        System.out.println();
        // 3행
        for (int i = 0; i < 0; i++)
            System.out.print(space);
        for (int i = 0; i < 3; i++)
            System.out.print(star);
        System.out.println();
        System.out.println("======================");
        // 3차풀이
        System.out.println("3차");
        int a = 3;
        int b = 0;
        // 1행
        a--;
        b++;
        for (int i = 0; i < a; i++)
            System.out.print(space);
        for (int i = 0; i < b; i++)
            System.out.print(star);
        System.out.println();
        // 2행
        a--;
        b++;
        for (int i = 0; i < a; i++)
            System.out.print(space);
        for (int i = 0; i < b; i++)
            System.out.print(star);
        System.out.println();
        // 3행
        a--;
        b++;
        for (int i = 0; i < a; i++)
            System.out.print(space);
        for (int i = 0; i < b; i++)
            System.out.print(star);
        System.out.println();
        System.out.println("======================");
        // 4차풀이
        System.out.println("4차");
        a = 3;
        b = 0;

        for (int k = 0; k < 3; k++) {
            a--;
            b++;
            for (int i = 0; i < a; i++)
                System.out.print(space);
            for (int i = 0; i < b; i++)
                System.out.print(star);
            System.out.println();
        }
        System.out.println("======================");
        // 5차풀이
        System.out.println("5차");
        a = 3;
        b = 0;
        int c = a;

        for (int k = 0; k < c; k++) {
            a--;
            b++;
            for (int i = 0; i < a; i++)
                System.out.print(space);
            for (int i = 0; i < b; i++)
                System.out.print(star);
            System.out.println();
        }
    }
}
