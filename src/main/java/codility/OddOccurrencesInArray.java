package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int oddElement = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key,1);
            }
        }

        for(Integer key: map.keySet()) {
            if(map.get(key) % 2 != 0) {
                oddElement = key;
            }
        }

        return oddElement;
    }
}
