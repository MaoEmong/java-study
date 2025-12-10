package ex08;

public class DivideByZeroOK {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println("나눗셈 결과 : "+result);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
