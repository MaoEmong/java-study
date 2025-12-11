package algo;

import java.util.HashMap;
import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        int[] arr = new int[6];
        HashMap<Integer,Integer> map = new HashMap<>();
        Random r = new Random();
        int index = 0;
        while(index < arr.length)
        {
            int val = r.nextInt(45) + 1;
            if(!map.containsKey(val))
            {
                map.put(val,index);
                arr[index] = val;
                index++;
            }
        }
        for(var n : arr)
            System.out.print(n + " ");
    }
}
