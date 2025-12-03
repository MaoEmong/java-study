package ex03;
/*
 * 2단부터 9단까지 구구단을 출력하는 코드 제작
 * */
public class ForTest00 {
    public static void main(String[] args) {
        // 1차풀이 2단부터 차례대로 구구단 작성
        // 2차풀이 변화하는 단수를 변수로 지정하고 구구단의 값 설정
        // 3차풀이 중복되는 코드를 for문을 사용하여 압축
        int a = 1;

        for(int i = 0 ; i < 8; i++)
        {
            a++;
            System.out.println(a+" * 1 = "+(a * 1));
            System.out.println(a+" * 2 = "+(a * 2));
            System.out.println(a+" * 3 = "+(a * 3));
            System.out.println(a+" * 4 = "+(a * 4));
            System.out.println(a+" * 5 = "+(a * 5));
            System.out.println(a+" * 6 = "+(a * 6));
            System.out.println(a+" * 7 = "+(a * 7));
            System.out.println(a+" * 8 = "+(a * 8));
            System.out.println(a+" * 9 = "+(a * 9));
            System.out.println();
        }
    }
}
