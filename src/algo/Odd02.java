package algo;

/*
1부터 100까지 수를 출력하는데, 홀수면 홀수, 짝수면 짝수를 출력하시오

1) 비지니스 파악
2) 샘플링하기 5개 (1 ~ 5) 까지만 파악
3) 노가다
4) 패턴 찾기
5) 코드 압축
 */
public class Odd02 {
    public static void main(String[] args) {
        int num = 1;
        String result = "홀수";
        for(int i = 0 ; i < 100; i++)
        {
            if (num % 2 == 0) {
                result = "짝수";
            } else {
                result = "홀수";
            }
            System.out.println(num + "은 " + result + "입니다");
            num++;
        }
    }
}
