package ex13;

import java.util.ArrayList;
import java.util.List;

public class Collect01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(); // 내부적으로 10칸짜리 배열이 만들어짐 [Integer 타입]
        // 1. 추가
        arr.add(1);
        arr.add(3);
        arr.add(5);
        // 2. 찾기
        System.out.println(arr.get(2));
        // 3. 삭제
        arr.remove(0);
        System.out.println(arr.size());
        // 4. contains
        boolean isThree = arr.contains(3);
        System.out.println(isThree);
        // 5. 배열로 출력
        for(Integer n : arr)
        {
            System.out.println(n);
        }
    }
}
