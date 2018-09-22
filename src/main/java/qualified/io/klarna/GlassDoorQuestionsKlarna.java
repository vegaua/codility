package qualified.io.klarna;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class GlassDoorQuestionsKlarna {

    /**
     * Write a method which gets a number as int[] (each digit will be an array element)
     * and add 1 to it and return the result as an other int[], [2,6,9] -> [2,7,0]
     */

    public int[] addDigitToANumberAsArray(int[] array, int digit) {
        String stringRepresentationOfNumber = "";
        for (int i = 0; i < array.length; i++) {
            stringRepresentationOfNumber = stringRepresentationOfNumber.concat(String.valueOf(array[i]));
        }
        if (StringUtils.isBlank(stringRepresentationOfNumber)) {
            stringRepresentationOfNumber = "0";
        }
        stringRepresentationOfNumber = String.valueOf(Integer.parseInt(stringRepresentationOfNumber) + digit);
        int[] result = new int[stringRepresentationOfNumber.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(stringRepresentationOfNumber.substring(i, i + 1));
        }

        return result;
    }

    /**
     * Write the multiples of a num
     */

    public void printMultiplesOfNumber(int num) {
        for (int i = 0; i < 100; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }

    /**You're given a String consisting of positive integers delimited by whitespace.
     * You must get these integers and weight sort them. Sort first according to the sum
     * of digits in each integer, if the sums are equal, the smaller one comes first. Use Java8 Comparator. comparing
     */
    public String sortNumbers(String inputIntegers) {
        List<Integer> numbers = new ArrayList(Arrays.asList(inputIntegers.split(" ")));
        List<String> strNums = new ArrayList(Arrays.asList(inputIntegers.split("")));
//        Comparator<String> inputComparator = Comparator.comparing(strNums.stream(), (v1, v2) -> {
//            return v1.
//        });

        return null;

    }


}
