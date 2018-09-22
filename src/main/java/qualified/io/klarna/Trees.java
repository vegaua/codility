package qualified.io.klarna;

import java.awt.Point;
import java.util.*;


public class Trees {

    List<Double> getBestAngle(double alpha, Point[] trees) {

        List<Double> treesAngles = convertCoordinatesToAngles(trees);
        Collections.sort(treesAngles);
        Map<Integer, List<Double>> treesAndAngles = new HashMap<>();

        if (treesAngles.isEmpty()) return Collections.emptyList();

        for (int pos = 0; pos < treesAngles.size(); pos++) {
            double alphaStartPos = treesAngles.get(pos);
            int treesInRange = getTreesInRange(alpha + alphaStartPos, treesAngles, pos);
            List<Double> listOfAngles = new ArrayList<>();
            if (treesAndAngles.containsKey(treesInRange)) {
                listOfAngles = treesAndAngles.get(treesInRange);
            }
            listOfAngles.add(alphaStartPos);
            treesAndAngles.put(treesInRange, listOfAngles);

        }

        int max = Collections.max(treesAndAngles.keySet());
        System.out.println("anglePos = " + treesAndAngles.get(max) + " trees: " + max);
        return treesAndAngles.get(max);
    }

    private Integer getTreesInRange(double alpha, List<Double> treesAngles, int pos) {
        int counter = 0;
        for (int i = pos; i < treesAngles.size(); i++) {
            if (treesAngles.get(i) <= alpha) {
                counter++;
            }
        }
        return counter;
    }

    private List<Double> convertCoordinatesToAngles(Point[] trees) {
//        List<Double> list = Arrays.asList(10.00, 20.00, 30.00, 40.00, 45.00, 5.00);
//        List<Double> list = Arrays.asList(10.00, 20.00, 30.00, 40.00, 45.00, 5.00);
        List<Double> list = Arrays.asList(10.00, 5.00, 100.00, 125.00, 130.00, 140.00, 200.00, 320.00);
        return list;
    }


    public static void main(String[] args) {
        new Trees().getBestAngle(30, null);
    }
}
