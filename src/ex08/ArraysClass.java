package ex08;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] array = {9, 4, 5, 6, 2, 1};
        Arrays.sort(array);
        printArray(array);
        System.out.println(Arrays.binarySearch(array,9));
        Arrays.fill(array,8);
        printArray(array);
    }
    private static void printArray(int[] array)
    {
        System.out.print("[");
        for(int n : array)
            System.out.print(n+" ");
        System.out.println("]");
    }
}
