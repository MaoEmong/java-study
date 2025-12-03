package algo;

/*
6의 약수를 구하고 8의 약수를 구해서 최대 공약수 찾기

1) 비지니스 (6을 1부터 6까지 나눠서 떨어지는 약수를 배열에 담기)
2)        (8을 1부터 8까지 나눠서 떨어지는 약수를 배열에 담기)
3) arr1 = {1,2,3,6}
4) arr2 = {1,2,4,8}
5) 두 배열을 비교해서 최대공약수 찾기
6) 후보 1 -> 2 int result에 담기
 */

public class Gcd04 {
    // 책임 : 약수를 구해서 return 한다
    // 함수는 책임을 하나만 가진다 (여러개 가질 순 있으나 이후 유지보수에서 매우매우 불리)
    static int[] 약수구하기(int a) {
        int[] arr1 = new int[a];
        int n1 = 0;
        int k1 = 1;

        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }

        return arr1;
    }

    // 책임 : 최대공약수를 구해서 return 한다
    static int 최대공약수구하기(int[] arr1, int[] arr2) {
        int result = 0;
        int c = 0;
        for (int i = 0; i < 4; i++) {
            if (arr1[c] == arr2[0]) result = arr1[c];
            if (arr1[c] == arr2[1]) result = arr1[c];
            if (arr1[c] == arr2[2]) result = arr1[c];
            if (arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }

        return result;

    }

    public static void main(String[] args) {
        // 1. 약수 구하기
        int[] arr1 = 약수구하기(6); // [1][2][3][6][0][0]
        int[] arr2 = 약수구하기(8); // [1][2][4][8][0][0][0][0]

        // 2. 최대공약수 구하기
        int result = 최대공약수구하기(arr1, arr2);

        System.out.println("최대공약수 : " + result);

        System.out.println("메인 끝");
    } // end of main
}
