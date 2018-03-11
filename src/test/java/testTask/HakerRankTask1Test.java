package testTask;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HakerRankTask1Test {

    HakerRankTask1 hakerRankTask1 = new HakerRankTask1();

    @Test
    public void hakerTest1 () {
        Assert.assertThat(HakerRankTask1.findNumber(new int[] {1,2,4,5}, 3), Is.is("NO"));
    }

    @Test
    public void hakerTest2 () {
        Assert.assertThat(HakerRankTask1.findNumber(new int[] {1,2,4,5,3,2,6,2,3,6,0}, 3), Is.is("YES"));
    }
}
