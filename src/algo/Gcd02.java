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

public class Gcd02 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[] arr1 = new int[a]; // [1][2][3][6][0][0]
        int[] arr2 = new int[b]; // [1][2][4][8][0][0][0][0]

        // 1. 6의 약수 채우기
        int n1 = 0;
        if (a % 1 == 0) {
            arr1[n1] = 1;
            n1++;
        }
        if (a % 2 == 0) {
            arr1[n1] = 2;
            n1++;
        }
        if (a % 3 == 0) {
            arr1[n1] = 3;
            n1++;
        }
        if (a % 4 == 0) {
            arr1[n1] = 4;
            n1++;
        }
        if (a % 5 == 0) {
            arr1[n1] = 5;
            n1++;
        }
        if (a % 6 == 0) {
            arr1[n1] = 6;
            n1++;
        }

        // 2. 8의 약수 채우기
        int n2 = 0;
        if (b % 1 == 0) {
            arr2[n2] = 1;
            n2++;
        }
        if (b % 2 == 0) {
            arr2[n2] = 2;
            n2++;
        }
        if (b % 3 == 0) {
            arr2[n2] = 3;
            n2++;
        }
        if (b % 4 == 0) {
            arr2[n2] = 4;
            n2++;
        }
        if (b % 5 == 0) {
            arr2[n2] = 5;
            n2++;
        }
        if (b % 6 == 0) {
            arr2[n2] = 6;
            n2++;
        }
        if (b % 7 == 0) {
            arr2[n2] = 7;
            n2++;
        }
        if (b % 8 == 0) {
            arr2[n2] = 8;
            n2++;
        }

        // 3. 최대공약수 구하기
        int result = 0;
        int c = 0;
        if (arr1[c] == arr2[0]) result = arr1[c];
        if (arr1[c] == arr2[1]) result = arr1[c];
        if (arr1[c] == arr2[2]) result = arr1[c];
        if (arr1[c] == arr2[3]) result = arr1[c];
        c++;

        if (arr1[c] == arr2[0]) result = arr1[c];
        if (arr1[c] == arr2[1]) result = arr1[c];
        if (arr1[c] == arr2[2]) result = arr1[c];
        if (arr1[c] == arr2[3]) result = arr1[c];
        c++;
        System.out.println("메인 끝");
    } // end of main
}
