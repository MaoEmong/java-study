package algo;

import java.util.Random;

public class Lotto07 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        int n;
        int maxNum = 6;
        for (int k = 0; k < arr.length; k++) {
            n = rand.nextInt(maxNum) + 1;
            for (int i = 0; i < k; i++) {
                if (arr[i] == n) {
                    n = rand.nextInt(maxNum) + 1;
                    i = -1;
                }
            }
            arr[k] = n;
        }

        for (var val : arr)
            System.out.print(val + " ");
    }
}
