package binary_gap;

public class BinaryGap {

    public int solution(int N) {
        char[] values = Integer.toBinaryString(N).toCharArray();
        int maxLength = 0;
        int BINARY_ZERO = 48;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == BINARY_ZERO) { // is zero
                int tmpLeft = 0;
                while (tmpLeft < i && values[i - tmpLeft - 1] == BINARY_ZERO) {
                    tmpLeft++;
                }

                int tmpRight = 0;
                while (tmpRight + i < values.length && values[i + tmpRight] == BINARY_ZERO) {
                    tmpRight++;
                }

                if (tmpRight + i != values.length) {
                    maxLength = Math.max(maxLength, tmpLeft + tmpRight);
                }
            }
        }
        return maxLength;
    }

}
