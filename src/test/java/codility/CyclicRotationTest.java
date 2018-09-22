package codility;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CyclicRotationTest {

    CyclicRotation cr = new CyclicRotation();

    @Test
    public void simpleArrayRotationTest() {
        int [] array = {1,2,3,4,5};
        int [] resultArray = {4,5,1,2,3};
        Assert.assertThat(cr.solution(array, 2), Is.is(resultArray));
    }

    @Test
    public void equalElementsArrayRotationTest() {
        int [] array = {0,0,0,0,0,0,0};
        Assert.assertThat(cr.solution(array, 3), Is.is(array));
    }

    @Test
    public void rotationNumberIsMoreThanArrayLengthTest() {
        int [] array = {1,2,3,4};
        int [] resultArray = {4,1,2,3};
        Assert.assertThat(cr.solution(array, 5), Is.is(resultArray));
    }

    @Test
    public void rotationNumberIsEqualToArrayLengthTest() {
        int [] array = {1,2,3,4};
        Assert.assertThat(cr.solution(array, 4), Is.is(array));
    }

    @Test
    public void arrayIsEmptyTest() {
        int [] array = {};
        Assert.assertThat(cr.solution(array, 4), Is.is(array));
    }

    @Test
    public void oneElementArrayTest() {
        int [] array = {1};
        Assert.assertThat(cr.solution(array, 4), Is.is(array));
    }
}
