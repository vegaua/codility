package qualified.io.klarna;

import java.util.*;

public class Task3 {

    public double evaluate(String expr) {
        if (expr == null || expr.isEmpty()) return 0.0;
        List<String> operators = Arrays.asList("/", "*", "-", "+");
        LinkedList<Double> container = new LinkedList<>();

        for (String elm : expr.split(" ")) {
            if (operators.contains(elm)) {
                Double value2 = container.pollLast();
                Double value1 = container.pollLast();
                Double result = applyOperator(elm, value1, value2);
                container.add(result);
            } else {
                container.add(Double.parseDouble(elm));
            }
        }
        return container.pollLast();
    }

//    private Double getAndRemoveLatestValueFromContainer(List<Double> list) {
//        Double latestValue = 0.0;
//        if (!list.isEmpty()) {
//            latestValue = list.get(list.size() - 1);
//        }
//        list.remove(list.size() - 1);
//        return latestValue;
//    }

    private double applyOperator(String operator, Double value1, Double value2) {
        Double result = null;
        switch (operator) {
            case "/":
                result = value1 / value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "+":
                result = value1 + value2;
                break;
        }
        return result;
    }
}
