package ex02;

import java.util.Scanner;

public class CalTime {
    static final double PI = 3.141592;
    static Scanner sc = new Scanner((System.in));

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("초를 입력하세요");
//        int time = sc.nextInt();    // 키보드 입력 대기

        int time = 100;
        int sec = time % 60;    // 100을 입력 받았을 때 이를 60으로 나눈 나머지 값
        int min = time / 60;    // 100을 입력 받았을 때 이를 60으로 나눈 정수 값
        System.out.println(time + "초는 "+min+"분 "+sec+"초 입니다");

    }

    public static void Light()
    {
        // final -> readonly
        final double LIGHT_SPEED = 365;
        double distance;

        distance = LIGHT_SPEED * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년동안 가는 거리는 : "+distance+" 입니다.");
    }
    public static void AreaTest()
    {
        double radius,area;

        radius = 5.0;
        area = PI * radius*radius;
        System.out.println("반지름이 5인 원의 면적은 "+area+" 입니다");
    }
    public static void TypeConversion()
    {
        int i;
        double f;
        f = 1 / 5;
        System.out.println(f);

        f =(double) 1 / 5;
        System.out.println(f);

        i = (int)1.7 + (int) 1.8;
        System.out.println(i);
    }

    public static void Add2()
    {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫 번째 숫자를 입력하세요");
        x = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요");
        y = sc.nextInt();

        sum = x + y;
        System.out.println("두 숫자의 합은 "+sum+"입니다");
    }

    public static void InOperator()
    {
        int x = 1, y = 1;

        int a = x + 1;
        int b = y + 1;
        System.out.println("a="+a+", b="+b);
        int c = 100, d = 200;
        c= c + 10;
        d= d / 10;
        System.out.println("c="+c+", d="+d);

    }
    public static void CompOperator()
    {
        System.out.print((3 == 4) + " ");
        System.out.print((3 != 4) + " ");
        System.out.print((3 > 4) + " ");
        System.out.print((4 > 3) + " ");
    
        System.out.print((3 == 3 && 4 == 7)+ " ");
        System.out.print((3 == 3 || 4 == 7)+ " ");
    }
    public static void Pizza()
    {
        double area1 = 2 * PI * 20 * 20;
        double area2 = PI * 30 * 30;
        System.out.println("20cm 피자 면적 = "+area1);
        System.out.println("30cm 피자 면적 = "+area2);
        System.out.println((area1 > area2) ? "20cm 두 개" : "30cm 한 개");
    }
    public static void FandC()
    {
        System.out.println("================================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("================================");
        System.out.println("원하는 선택을 입력해주세요");
        int select = sc.nextInt();
        switch(select)
        {
            case 1:
                FToC();
                break;
            case 2:
                CToF();
                break;
            default:
                System.out.println("잘못된 선택입니다");
                break;
        }
    }
    public static void FToC()
    {
        System.out.println("화씨 온도를 입력하세요");
        double f = sc.nextDouble();
        double c = (f - 32) * ((double)5/9);
        System.out.println("섭씨 온도는 "+c+"입니다");
    }
    public static void CToF()
    {
        System.out.println("섭씨 온도를 입력하세요");
        double c = sc.nextDouble();
        double f = c * ((double)9/5) + 32;
        System.out.println("화씨 온도는 "+f+"입니다");
    }

    public static void EventOdd()
    {
        int number;

        System.out.println("정수를 입력하세요");
        number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println("입력한 정수는 짝수입니다");
        else
            System.out.println("입력한 정수는 홀수입니다");
    }
}
