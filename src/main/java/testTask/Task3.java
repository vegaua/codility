package testTask;

import com.google.common.primitives.Ints;

import java.util.*;

public class Task3 {


    public int solution(int[] inputArray) {
        Set<Integer> tours = new HashSet(Ints.asList(inputArray));
        Set<Integer> vacationLengths = new TreeSet<>();

        for (int i = 0; i < inputArray.length; i++) {
            List<Integer> currentTour = new ArrayList<>();
            for (int j = i; j < inputArray.length; j++) {
                currentTour.add(inputArray[j]);
                if (currentTour.containsAll(tours)) {
                    vacationLengths.add(currentTour.size());
                    break;
                }
            }
        }

        return Collections.min(vacationLengths);
    }

}
