package algo;

/*
1 ~ 100까지의 수에서 2의 배수를 출력하시오

1) 비지니스
2) 샘플링 (1~10)
3) 노가다
4) 패턴
 */

public class T02 {
    public static void main(String[] args) {
        int a = 0;
        int length = 100;

        /*
        풀이 1
        for(int i = 0 ; i < length / 2; i++)
        {
            a = a + 2;
            System.out.print(a + " ");
        }
         */

        /*
        풀이 2
            for (int i = 0; i < length; i++) {
                a = a + 1;
                if (a % 2 == 0)
                System.out.print(a + " ");
            }
         */


    }
}
