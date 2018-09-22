package qualified.io.klarna;

import org.junit.platform.commons.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

//    public static String maskify(String creditCardNumber) {
//        final Pattern PATTERNCARD =
//                Pattern.compile("([0-9]{4})?([0-9]{2})" +
//                        "|" +
//                        "(([0-9]{4})?([0-9]{4})?([0-9]{4})?([0-9]{4}))");
//        Matcher matcher = PATTERNCARD.matcher(creditCardNumber);
//        if (matcher.find()) {
//            creditCardNumber = replaceNumberWithMaskSymbols(creditCardNumber);
//        }
//        return creditCardNumber;
//    }

    private static String replaceNumberWithMaskSymbols(String ccNumber) {
        int numOfVisibleFromStart = 1;
        int numOfVisibleFromEnd = 4;

        if(ccNumber.length()<=numOfVisibleFromStart+numOfVisibleFromEnd) {
            return ccNumber;
        }

        String maskedPart = ccNumber.substring(numOfVisibleFromStart, ccNumber.length() - numOfVisibleFromEnd);
        StringBuilder maskedCardNumber = new StringBuilder();
        maskedPart = getMaskForGroup(maskedPart);
        maskedCardNumber.append(ccNumber.substring(0, numOfVisibleFromStart)).append(maskedPart)
                .append(ccNumber.substring(ccNumber.length()- numOfVisibleFromEnd, ccNumber.length()));
        return maskedCardNumber.toString();

    }

    private static String getMaskForGroup(String matchedGroup) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matchedGroup.length(); i++) {
            if(Character.isDigit(matchedGroup.toCharArray()[i])) {
                sb.append("#");
            } else {
                sb.append(matchedGroup.toCharArray()[i]);
            }
        }
        return sb.toString();
    }

    private final int SIZE = 6;
    private final int NUMBER_OF_LASTCHARS_NOTTO_MASK = 4;



    /**
     * It is assumed that creditCardNumber starts with a digit and ends with 4 digits.
     * @param creditCardNumber
     * @return masked creditCardNumber
     *
     * https://github.com/ahmetdursun/Coding-Challenges/tree/master/src/main/java/com/mobcom/fintech
     */
    public String maskify(String creditCardNumber) {

        if (StringUtils.isBlank(creditCardNumber)) {
            return "";
        }

        if (creditCardNumber.length() < SIZE) {
            return creditCardNumber;
        }

        if (creditCardNumber.replaceAll("\\D", "").length() < SIZE) {
            return creditCardNumber;
        }

        int cardLength = creditCardNumber.length();

        String inner = creditCardNumber.substring(1, cardLength - NUMBER_OF_LASTCHARS_NOTTO_MASK);
        inner = inner.replaceAll("[0-9]", "#");

        creditCardNumber = creditCardNumber.charAt(0) + inner + creditCardNumber.substring(cardLength - NUMBER_OF_LASTCHARS_NOTTO_MASK);
        return creditCardNumber;

    }
}
