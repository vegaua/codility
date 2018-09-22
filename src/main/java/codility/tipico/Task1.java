package codility.tipico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public int solution(int[] A) {
        if (A.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        List<Integer> evenIntegers = new ArrayList<>();

        for (int i = 0; i <A.length ; i++) {
            if(A[i] % 2 == 0) {
                evenIntegers.add(A[i]);
            }
        }

        return Collections.min(evenIntegers);
    }

}
