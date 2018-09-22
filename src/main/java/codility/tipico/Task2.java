package codility.tipico;

public class Task2 {

    int solution(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            ans += A[i];
        }
        return ans;
    }
}
