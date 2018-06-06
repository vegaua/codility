package flixBus;

import java.util.*;

public class Task3 {

    static int[] isPowerOf2(int[] nums) {
        Set<Integer> inputSet = new HashSet();
        for (int num: nums) inputSet.add(num);
        List<Integer> listOfNums = new ArrayList(inputSet);
        Collections.sort(listOfNums);
        List<Integer> listOfPowers = new ArrayList<>();

        for(Integer digit: listOfNums) {
            int value = (digit & (digit - 1)) == 0 ? 1 : 0;
            listOfPowers.add(value);
        }

        return listOfPowers.stream().mapToInt(i -> i).toArray();
    }
}
