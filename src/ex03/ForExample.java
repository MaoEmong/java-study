package ex03;

public class ForExample {
    public static void main(String[] args) {
        // 1. 1 부터 10 까지 출력하는 프로그램을 만드시오
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println();

        // 2. 20부터 11까지 출력하는 프로그램을 만드시오
        for (int i = 20; i >= 11; i--)
            System.out.println(i);

        System.out.println();

        // 3. 1부터 10까지 더해서 합을 출력하는 프로그래믈 만드시오
        int sum = 0;
        for (int i = 0; i <= 10; i++)
            sum += i;
        System.out.println("=======================");
        // 한번에 끝내는 법
        sum = 0;
        int num = 10;
        sum = (num + 1) * (num / 2);

        System.out.println(sum);

        System.out.println();

        // 4. 별찍기
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");
        // 강사님 풀이
        String star = "*";
        /*
        1차
// 1 행
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.println();
// 2행
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.println();
        // 3행
        System.out.print(star);
        System.out.print(star);
        System.out.print(star);
        System.out.println();
        // 4행
        System.out.print(star);
        System.out.print(star);
        System.out.println();
        // 5행
        System.out.print(star);
        System.out.println();
        */

        /*
        2차
        for (int i = 0; i < 6 ; i++) {
            System.out.print(star);
        }
        System.out.println();
        for (int i = 0; i < 5 ; i++) {
            System.out.print(star);
        }
        System.out.println();
        for (int i = 0; i < 4 ; i++) {
            System.out.print(star);
        }
        System.out.println();
        ...
        */

        // 3차
        int c = 5;
        /*
        3차
        for (int i = 0; i < c ; i++) {
            System.out.print(star);
        }
        System.out.println();
        c--;
        for (int i = 0; i < c ; i++) {
            System.out.print(star);
        }
        System.out.println();
        c--;
        for (int i = 0; i < c ; i++) {
            System.out.print(star);
        }
        System.out.println();
        c--;
        */
// 4차
        int row = c;
        for(int k = 0 ; k < row; k++)
        {
            for (int i = 0; i < c; i++) {
                System.out.print(star);
            }
            System.out.println();
            c--;
        }



        System.out.println();

        // 5. 별찍기
        //     *
        //    **
        //   ***
        //  ****
        // *****
        int starCount = 4;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= starCount) System.out.print("*");
                else System.out.print(" ");
            }
            starCount--;
            System.out.println();
        }
    }
}
