package algo;

/*
12의 약수를 출력하시오
1) 비지니스 이해 (12를 1부터 12까지 다 나눠서 나누어 떨어지면 약수)
2) 샘플링 6의 약수 구하기
3) 노가다
4) 패턴 찾기
 */

public class Divisor02 {
    public static void main(String[] args) {
        int num = 18;
        int count = 0;


        for (int i = 0; i < num / 2; i++) {
            if (num % (i + 1) == 0) {
                System.out.println((i + 1) + "은 약수");
                count++;
            }
        }
        System.out.println(num + "은 약수");
        count++;

        System.out.println(count);
    }
}
