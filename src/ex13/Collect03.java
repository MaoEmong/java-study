package ex13;

import java.util.HashSet;
import java.util.Random;

public class Collect03 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        Random rand = new Random();
        int n;

        while(true)
        {
            n = rand.nextInt(45)+ 1;
            set.add(n);

            if(set.size()==6)break;
        }
        for(var v : set)
        {
            System.out.println(v);
        }
    }
}
