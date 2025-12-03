package ex03;

public class CoinTest {
    public static void main(String[] args) {
        int[] coins = {500,100,50,10};
        int money = 4710;

        int count = 0;
        int rest = money;

        for(int i = 0 ; i < coins.length;i++)
        {
            count += rest / coins[i];
            System.out.println(coins[i]+"원 동전 갯수 : "+rest / coins[i]);
            rest = rest % coins[i];
            System.out.println("남은 금액 : " + rest);

            if(rest == 0)break;
        }
        System.out.println("가질 수 있는 최소한의 동전 갯수 : "+count);
    }
}
