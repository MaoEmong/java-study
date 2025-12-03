package ex03;

import java.util.Scanner;

public class RockPaperSissor {
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(0), 바위(1), 보(2)");
        int number = sc.nextInt();

        int computer = (int) Math.random()* 3;
        if(number == computer)
        {
            System.out.println("컴퓨터와 비겼음");
        }
        else if (number == (computer + 1) % 3)
        {
            System.out.println("인간 : "+ number + "컴퓨터 : "+computer + " 인간 승리");
        }
        else
        {
            System.out.println("인간 : "+ number + "컴퓨터 : "+computer + " 컴퓨터 승리");
        }

    }
}
