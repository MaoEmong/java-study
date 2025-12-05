package algo;

// 다른 유틸리티의 데이터 사용

// ~util.* util의 하위 데이터들을 전부 사용

import java.util.Arrays;

// 이진탐색(Binary Search)
public class BSearch05 {

    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 3, 0, 8, 9, 5, 6, 10};  // 11개 log 11

        Arrays.sort(arr);   // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        int target = 8;

        int startIndex = 0;
        int endIndex = arr.length - 1;
        int mid = (endIndex - startIndex) / 2;

        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);
        }

        startIndex = mid + 1;
        mid = (endIndex - startIndex)/2 + startIndex;
        // mid = (startIndex + endIntex) / 2;

        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }
        startIndex = mid + 1;
        mid = (endIndex - startIndex)/2 + startIndex;
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }
    }
}


//Quicksort