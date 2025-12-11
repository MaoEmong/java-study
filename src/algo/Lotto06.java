package algo;

import java.util.Random;

public class Lotto06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        int n;
        boolean isSame;
        for(int k = 0 ; k < arr.length; k++)
        {
            while (true) {
                isSame = false;
                n = rand.nextInt(45) + 1;
                for(int i = 0 ; i < k; i++)
                {
                    isSame = false;
                    if (arr[i] == n) {
                        isSame = true;
                    }
                }
                if (!isSame) {
                    arr[k] = n;
                    break;
                }
            }
        }
    }
}
