package ex03;

import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) {
        int number;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        number = sc.nextInt();
        
        if(number % 2 == 0)
        {
            System.out.println("입력한 값은 짝수입니다.");
        }
        else
        {
            System.out.println("입력한 값은 홀수입니다.");
            
        }
    }
}
