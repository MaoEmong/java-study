package algo;
import java.util.Arrays;

// 이진탐색(Binary Search)
public class BSearch06 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 8, 11, 26, 28, 33, 29};
        // 1. 데이터 정렬
        Arrays.sort(arr);

        // 2. 변수 설정
        int target = 7; // 목표값
        int result = -1; // 찾은 값의 인덱스 번호
        int startIndex = 0; // 탐색 시작 지점
        int endIndex = arr.length - 1; // 탐색 끝 지점
        // mid = (startIndex + endIntex) / 2;
        int count = 1;  // 반복 횟수 체크

        //루프 시작(시작지점이 종료지점보다 작거나 같을떄만 반복)
        while (startIndex <= endIndex) {
            // 중간값 체크
            int mid = (endIndex - startIndex) / 2 + startIndex;
            // 진행상황 체크
            System.out.println(count + ". " + "start: " + startIndex + "/ end: "
                    + endIndex + "/ value: " + arr[mid] + "/ mid: " + mid);
            // 타겟을 찾았을 때 탈출
            if (target == arr[mid]) {
                System.out.println(target + "을 찾았습니다 인덱스는 " + mid);
                result = mid;
                break;
            }
            // 목표값이 탐색 지점 값보다 작을떄
            if (target < arr[mid]) {
                // 종료지점을 앞으로 땡김
                endIndex = mid - 1;
            }
            // 목표값이 탐색 지점 값보다 작을떄
            if (target > arr[mid]) {
                // 시작지점을 뒤로 밈
                startIndex = mid + 1;
            }

            count++;
        }
        // 목표값을 찾지 못했을 때
        if (result < 0) System.out.println("찾는숫자 " + target + "가 배열안에 존재하지 않습니다");
        System.out.println("동작 종료");
    }
}


//Quicksort