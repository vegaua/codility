package codility.tipico;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask1 {

    Task1 task1 = new Task1();

    @Test
    public void firstTest() {
        int [] array = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        Assert.assertThat(task1.solution(array), Is.is(-100));
    }

    @Test
    public void secondTest() {
        int [] array = {-6, -91, 1011, -10000, 84, -22, 0, 1, 10000, -10000};
        Assert.assertThat(task1.solution(array), Is.is(-10000));
    }

    @Test
    public void thirdTest() {
        int [] array = {2};
        Assert.assertThat(task1.solution(array), Is.is(2));
    }

    @Test
    public void fifthTest() {
        int [] array = {0};
        Assert.assertThat(task1.solution(array), Is.is(0));
    }

    @Test
    public void sixthTest() {
        int [] array = {0,2};
        Assert.assertThat(task1.solution(array), Is.is(0));
    }
}
