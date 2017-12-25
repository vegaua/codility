package dominator;

import java.util.*;
import java.util.stream.Collectors;

public class Dominator {

    int solution(int[] A) {
        if(A.length>0) {
            List<Integer> listOfNums = Arrays.stream(A).boxed().collect(Collectors.toList());
            List<Number> numbers = new LinkedList<>();
            for (int number : listOfNums) {
                numbers.add(new Number(number, getQuantityForNumber(numbers, number) + 1, listOfNums.indexOf(number)));
            }

            Number maxQuantityNumber = Collections.max(numbers);

            if (maxQuantityNumber.getQuantity() > listOfNums.size() / 2) {
                System.out.println(maxQuantityNumber.getIndex());
                return maxQuantityNumber.getIndex();
            }
        }
        System.out.println("-1");
        return -1;
    }

    private int getQuantityForNumber(List<Number> numbers, int number) {
        for (Number numberObject : numbers) {
            if (numberObject.getNumber() == number) {
                numbers.remove(numberObject);
                return numberObject.getQuantity();
            }
        }
        return 0;
    }

    private void newMethod() {
        // some body
    }

    private void oneMoreMethod() {

    }
}
