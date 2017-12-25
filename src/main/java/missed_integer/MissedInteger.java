package missed_integer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MissedInteger {

    int solution(int[] A) {
        List<Integer> listOfIntegers = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.sort(listOfIntegers);
        Predicate<Integer> moreThanZero = v -> v >= 0;

        listOfIntegers = listOfIntegers.stream().filter(moreThanZero).collect(Collectors.toList());

        if (listOfIntegers.isEmpty()) {
            return 1;
        } else {
            ListIterator listIterator = listOfIntegers.listIterator();
            int previousValue = listOfIntegers.get(0);
            int currentValue;

            while (listIterator.hasNext()) {
                currentValue = listOfIntegers.get(listIterator.nextIndex());

                if (currentValue - previousValue > 1) {
                    return previousValue + 1;
                }

                if (listOfIntegers.size() == listIterator.nextIndex() + 1
                        && listIterator.hasPrevious()) {
                    return currentValue + 1;
                }

                previousValue = currentValue;
                listIterator.next();
            }

            return previousValue;

        }


    }


}