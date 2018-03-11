package testTask;

import java.util.ArrayList;
import java.util.List;

public class HakerRankTask2 {

    static int[] oddNumbers(int l, int r) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = l; i <r ; i++) {
            if(i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        return oddNumbers.stream().mapToInt(i->i).toArray();

    }
}
