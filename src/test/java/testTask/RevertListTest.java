package testTask;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RevertListTest {

    RevertList rl = new RevertList();

    @Test
    public void testStringListRevertion() {
        List<String> list = new LinkedList() {{
            add("1");
            add("2");
            add("3");
        }};

        List<String> revertedList = new LinkedList<>(list);
        Collections.reverse(revertedList);

        Assert.assertThat(rl.revertList(list), Is.is(revertedList));
    }

    @Test
    public void testIntegerListRevertion() {
        List<String> list = new LinkedList() {{
            add(1);
            add(2);
            add(3);
        }};

        List<String> revertedList = new LinkedList<>(list);
        Collections.reverse(revertedList);

        Assert.assertThat(rl.revertList(list), Is.is(revertedList));

    }
}
