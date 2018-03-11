package testTask;


import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TelephoneNumberFormat {

    public String solutionRefactored(String S) {
        String delimiter = "-";
        int defaultGroupSize = 3;
        int spareGroupSize = 2;

        // Converting String to List of Strings
        List<String> listOfInputDigits = Chars.asList(S.toCharArray()).stream()
                .filter(v -> v.toString().matches("[0-9]")).map(Object::toString)
                .collect(Collectors.toList());
        String inputDigits = listOfInputDigits.stream().collect(Collectors.joining(""));

        List<String> telephoneGroups = new ArrayList<>();
        if (listOfInputDigits.size() % defaultGroupSize == 0) {
            telephoneGroups.addAll(getTelephoneNumberGroups(inputDigits, listOfInputDigits.size() / defaultGroupSize,
                    defaultGroupSize, 0));
        } else {
            int numberOfGroupsWithDefaultSize = listOfInputDigits.size() / defaultGroupSize;
            while ((listOfInputDigits.size() % numberOfGroupsWithDefaultSize) % spareGroupSize != 0) {
                numberOfGroupsWithDefaultSize--;
            }
            telephoneGroups.addAll(getTelephoneNumberGroups(inputDigits, numberOfGroupsWithDefaultSize,
                    defaultGroupSize, 0));
            telephoneGroups.addAll(getTelephoneNumberGroups(inputDigits,
                    (listOfInputDigits.size() - (numberOfGroupsWithDefaultSize * defaultGroupSize)) / spareGroupSize,
                    spareGroupSize, numberOfGroupsWithDefaultSize * defaultGroupSize));
        }

        return telephoneGroups.stream().collect(Collectors.joining(delimiter));
    }

    public List<String> getTelephoneNumberGroups(String input, int amountOfGroups, int groupSize, int startIndex) {
        List<String> groups = new ArrayList<>();
        for (int i = 0; i < amountOfGroups; i++) {
            groups.add(input.substring(startIndex, startIndex + groupSize));
            startIndex = startIndex + groupSize;
        }
        return groups;
    }




    public String solution(String S) {

        List<Character> listOfInputDigits = Chars.asList(S.toCharArray()).stream()
                .filter(v -> v.toString().matches("[0-9]+"))
                .collect(Collectors.toList());

        List<String> listOfPhoneNumberParts = new ArrayList<>();
        String delimiter = "-";
        int defaultDelimiterSize = 5;
        int additionalDelimiterSize = 2;
        int numberOfLastBlocksOfLengthTwo = (listOfInputDigits.size() % defaultDelimiterSize) == 1 ? 2 : 1;
        int numberOfFullParts = listOfInputDigits.size() / defaultDelimiterSize;

        if (listOfInputDigits.size() % defaultDelimiterSize != 0) {
            numberOfFullParts = (numberOfFullParts > 0) ? numberOfFullParts - numberOfLastBlocksOfLengthTwo + 1 : 0;
        }

        for (int i = 0; i < numberOfFullParts; i++) {
            int startIndex = i * defaultDelimiterSize;
            String numberPart = "";
            for (int listIndex = startIndex; listIndex < startIndex + defaultDelimiterSize; listIndex++) {
                numberPart += listOfInputDigits.get(listIndex).toString();
            }
            listOfPhoneNumberParts.add(numberPart);
        }

        if (listOfInputDigits.size() % defaultDelimiterSize != 0) {
            String part = "";
            int delimiterCounter = 0;
            for (int i = defaultDelimiterSize * numberOfFullParts; i < listOfInputDigits.size(); i++) {
                part += listOfInputDigits.get(i);
                delimiterCounter++;
                if (delimiterCounter % additionalDelimiterSize == 0) {
                    listOfPhoneNumberParts.add(part);
                    part = "";
                }
            }
        }

        return listOfPhoneNumberParts.stream().collect(Collectors.joining(delimiter));
    }


}
