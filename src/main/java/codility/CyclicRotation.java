package codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int pos = 0; pos < A.length; pos++) {
            int index = pos + K;
            if (A.length > 0 && index >= A.length) {
                index = index % A.length;
            }
            result[index] = A[pos];
        }

        return result;
    }
}
