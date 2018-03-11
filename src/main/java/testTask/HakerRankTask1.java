package testTask;

public class HakerRankTask1 {

    static String findNumber(int[] arr, int k) {
        for (int i : arr) {
            if (i == k) {
                return "YES";
            }
        }

        return "NO";

    }
}
