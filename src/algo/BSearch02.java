package algo;

// 다른 유틸리티의 데이터 사용

import java.util.Arrays;

// ~util.* util의 하위 데이터들을 전부 사용


// 이진탐색(Binary Search)
public class BSearch02 {
    public static void main(String[] args) {

        int[] arr = {10, 4, 1, 2, 3};
        int target = 2;

        Arrays.sort(arr); // [1, 2, 3, 4, 10]

        // 시작값
        int left = 0;
        // 마지막 값
        int right = arr.length - 1;
        // 결과
        int result = -1;

        while (left <= right) {
            // 중간값 설정
            int mid = (left + right) / 2;

            // 값을 찾았을 시 탈출
            if (arr[mid] == target) {
                result = mid;
                break;
            }

            if (target > arr[mid]) {
                left = mid + 1;   // 오른쪽 구간만 탐색
            } else {
                right = mid - 1;  // 왼쪽 구간만 탐색
            }
        }

        System.out.println("result : " + result);
    }
}


//Quicksort