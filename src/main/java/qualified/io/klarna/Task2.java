package qualified.io.klarna;

import javax.swing.event.TreeExpansionListener;
import java.util.List;

public class Task2 {

    public static String numberToOrdinal( Integer number ) {
        String suffix = "th";
        if (number == 0) suffix = "";
        if (number % 10 == 1 && number % 100 != 11) suffix = "st";
        if (number % 10 == 2 && number % 100 != 12) suffix = "nd";
        if (number % 10 == 3 && number % 100 != 13) suffix = "rd";
        return number + suffix;

    }
}
