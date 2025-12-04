package algo;

// 다른 유틸리티의 데이터 사용

import java.util.Arrays;

// ~util.* util의 하위 데이터들을 전부 사용
import java.util.*;

// 이진탐색(Binary Search)
public class BSearch01 {
    public static void main(String[] args) {
        // 10 찾기
        int[] arr = {10, 4, 1, 2, 3};

        // 1. 배열 정렬
        // Arrays 배열 관련 라이브러리
        // Arrays.sort() 배열 정렬
        // Arrays.sort(arr) arr배열의 데이터 오름차순 정렬
        // arr = {1, 2, 3, 4, 10}
        Arrays.sort(arr);

        // 2. 검색
        if (10 == arr[2]) {
            System.out.println("10를 찾았습니다.");
        }
        if (10 < arr[2]) {
            System.out.println("10은 작다");

            if (10 == arr[1]) {
                System.out.println("10을 찾았습니다");
            }
        } else {
            System.out.println("10은 크다");

            if (10 == arr[3]) {
                System.out.println("10을 찾았습니다");
            } else {
                System.out.println("arr[4]에 10이 있습니다");
            }
        }


        System.out.println("main 끝");
    }
}


//Quicksort