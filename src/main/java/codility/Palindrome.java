package codility;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs (STDOUT) numeric palindromes as a plain text list separated by a linefeed.
 * <p>
 * A palindrome is something that when read from the left is the same as when read from the right.
 * <p>
 * Examples for numeric palindromes are : 1, .., 88, 99, 101, 111, 121, ..., 25552, ....
 * <p>
 * Output should start at 1. The upper limit for possible palindromes to check is passed in as a command line arg.
 * <p>
 * With an upper limit of 1,000, the expected example output is:
 * 1
 * 2
 * ...
 * 989
 * 999
 * <p>
 * That means you print all numerical palindromes between 1 and 1,000.
 */
public final class Palindrome {

    public static void main(String[] args) {

        printPalindrome(new Palindrome().getPalindromes(Integer.valueOf(args[0])));
    }

    public List<Integer> getPalindromes(int endNum) {
        List<Integer> listOfPalindromes = new ArrayList<>();
        for (int i = 1; i < endNum; i++) {
            if (isPalindrome(i))
                listOfPalindromes.add(i);
        }
        return listOfPalindromes;
    }

    private boolean isPalindrome(int number) {
        StringBuilder sbReversed = new StringBuilder();
        StringBuilder sbOrig = new StringBuilder();
        sbOrig.append(number);
        sbReversed.append(number);
        sbReversed.reverse();
        return sbOrig.toString().equals(sbReversed.toString());
    }

    public static void printPalindrome(List<Integer> list) {
        list.stream().forEach(v -> System.out.println(v));
    }

}


