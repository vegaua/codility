package testTask;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test3 {

    Task3 task3 = new Task3();

    @Test
    public void testWithTwoDigitsOnTheEnd () {
        Assert.assertThat(task3.solution(new int[]{2, 1, 1, 3, 2, 1, 1, 3}), Is.is(3));
    }

    @Test
    public void testWithOneTypeOfTour () {
        Assert.assertThat(task3.solution(new int[]{1,1,1,1,1}), Is.is(1));
    }

    @Test
    public void pairedTours () {
        Assert.assertThat(task3.solution(new int[]{2, 2, 1, 1, 1, 1, 3, 3}), Is.is(6));
    }
}
