package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTest00 {
    public static void main(String[] args) {
        int money = 1270;
        int restMoney = money;
        int[] coins = {500,100,50,10};
        int a = -1;

        // 1차풀이 : 직접 각 동전마다 계산 실행
        // 2차풀이 : 동전의 개수와 남은 금액 변수를 통일
        // 3차풀이 : 동전을 배열화 하여 계산
        // 4차풀이 : 반복되는 부분을 확인하고 for문을 사용하여 압축

        for(int i = 0 ; i < 4;i++)
        {
            a++;
            int count = restMoney/coins[a];
            restMoney = restMoney%coins[a];
            System.out.println(coins[a] + "동전 개수 : "+count);
            System.out.println("남은 금액 : "+restMoney);
        }
    }
}