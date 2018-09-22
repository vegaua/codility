package fb;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Task3Test {

    Task3 task3 = new Task3();

    @Test
    public void task3Test1 () {
        Assert.assertThat(Task3.isPowerOf2(new int[] {3,2,3,4}), Is.is(new int[] {1,0,1}));
    }

    @Test
    public void task3Test2 () {
        Assert.assertThat(Task3.isPowerOf2(new int[] {3,2,3,-8}), Is.is(new int[] {1,1,0}));
    }
}
