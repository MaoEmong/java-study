package algo;

/*
12의 약수를 출력하시오
1) 비지니스 이해 (12를 1부터 12까지 다 나눠서 나누어 떨어지면 약수)
2) 샘플링 6의 약수 구하기
3) 노가다
4) 패턴 찾기
 */

public class Divisor01 {
    public static void main(String[] args) {
        int num = 6;
        int index = 1;
        String result = "맞음";

        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
        if(num % index == 0)
            result = "맞음";
        else result = "아님";
        System.out.println(index + "은 약수 " + result);
        index++;
    }
}
