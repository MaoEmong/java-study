package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<>();

        map.put("Kim","1234");
        map.put("Park","pass");
        map.put("lee","word");

        System.out.println(map.get("lee"));

        for(var key : map.keySet())
        {
            var val = map.get(key);
            System.out.println("key="+key+", value="+val);
        }

        map.remove(3);
        map.put("choi","password");
        System.out.println(map);

    }
}
