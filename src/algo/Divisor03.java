package algo;

/*
12의 약수를 출력하시오
1) 비지니스 이해 (12를 1부터 12까지 다 나눠서 나누어 떨어지면 약수)
2) 샘플링 6의 약수 구하기
3) 노가다
4) 패턴 찾기


(1) 12의 약수 [1,2,3,4,6,12] 배열에 담기
(2) 6의 약수 [1,2,3,6] 배열에 담기
(3) 두수의 최대 공약수 구하기 6 (배열을 비교해야함)

3. GCD 최대공약수 공식으로 풀기 (도전)
 */

public class Divisor03 {
    public static void main(String[] args) {
        int[] arr1 = GetDivisor(12);
        int[] arr2 = GetDivisor(6);

        int gcd = 0;
        gcd = GetGCD(arr1, arr2);

        System.out.println("GCD is " + gcd);

        gcd = GCD(32,15);
        System.out.println(gcd);
    }

    static int GetGCD(int[] arr1, int[] arr2) {
        int result = 0;

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j] && arr1[i] > result)
                    result = arr1[i];

        return result;
    }

    // 입력받은 값의 약수를 배열로 반환하는 함수
    static int[] GetDivisor(int num) {
        int count = 0;
        for (int i = 0; i < num / 2; i++) {
            if (num % (i + 1) == 0) {
                System.out.println((i + 1) + "은 약수");
                count++;
            }
        }
        System.out.println(num + "은 약수");
        count++;

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < num / 2; i++) {
            if (num % (i + 1) == 0) {
                result[index] = i + 1;
                index++;
            }
        }
        result[index] = num;

        return result;
    }

    static int GCD(int num1, int num2) {
        int result = 0;

        int head;
        int tail;

        if (num1 > num2) {
            head = num1;
            tail = num2;
        } else {
            head = num2;
            tail = num1;
        }

        int temp = tail;
        while(true)
        {
            temp = head % tail;
            if(temp == 0){
                result = tail;
                break;
            }
            head = tail;
            tail = temp;
        }


        return result;
    }
}
