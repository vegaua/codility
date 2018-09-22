package codility;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OddOccurrencesInArrayTest {

    OddOccurrencesInArray oc = new OddOccurrencesInArray();

    @Test
    public void simpleArrayTest () {
        int [] array = {1,2,3,5,3,2,1};
        Assert.assertThat(oc.solution(array), Is.is(5));
    }

    @Test
    public void arrayWithTheEqualElementsTest () {
        int [] array = {1,2,2,3,2,1,3};
        Assert.assertThat(oc.solution(array), Is.is(2));
    }

    @Test
    public void arrayWithEqualElementsTest () {
        int [] array = {1,1,1,1,1};
        Assert.assertThat(oc.solution(array), Is.is(1));
    }
}
