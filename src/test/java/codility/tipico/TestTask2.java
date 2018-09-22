package codility.tipico;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask2 {

    Task2 task2 = new Task2();

    @Test
    public void firstTest() {
        int [] array = {1,1,2,3,4};
        Assert.assertThat(task2.solution(array), Is.is(11));
    }
}
