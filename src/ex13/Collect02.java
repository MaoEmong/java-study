package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collect02 {
    public static void main(String[] args) {
        // 1. ArrayList 간편하게 만드는 법
        List<Integer> arr = Arrays.asList(1,2,3,4); // 크기 변경 불가능
        arr.add(5);

        for(var n : arr)
        {
            System.out.println(n);
        }

        // 2. 배열을 ArrayList로 만드는 법
        Integer[] arr2 = {1,3,5,7};
        List<Integer> arr3 = Arrays.asList(arr2);


    }
}
