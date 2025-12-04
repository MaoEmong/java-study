package LeapYear;

import java.util.Scanner;

public class LeapYear01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("윤년을 확인하고 싶은 년도를 입력해주세요.");
        int year = sc.nextInt();

        // 4년으로 딱 맞아떨어지면 윤년
        if (year % 4 == 0)
            System.out.println(year + "년도는 윤년입니다");
        else {
            // 100년단위로 맞아 떨어질 때
            if (year % 100 == 0) {
                // 400년으로도 딱 맞아 떨어진다면 윤년
                if (year % 400 == 0) {
                    System.out.println(year + "년도는 윤년입니다");
                }
                // 100년 단위로만 맞아 떨어지면 평년
                else {
                    System.out.println(year + "년도는 평년입니다");
                }
            }
            // 평년으로 맞아떨어지지 않으면서 100년단위로도 맞아떨어지지 않으면 평년
            else {
                System.out.println(year + "년도는 평년입니다");
            }
        }

    }
}
