package codility;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class TrailingZerosTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    TrailingZeros tz = new TrailingZeros();

    @Test
    public void simpleTest1() {
        int[] array = {7, 15, 6, 20, 5, 10};
        Assert.assertThat(tz.solution(array), Is.is(3));
    }

    @Test
    public void simpleTest2() {
        int[] array = {25, 10, 25, 10, 32};
        Assert.assertThat(tz.solution(array), Is.is(4));
    }

    @Test
    public void simpleTest3() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Assert.assertThat(tz.solution(array), Is.is(2));
    }

    @Test
    public void testWithZeros() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertThat(tz.solution(array), Is.is(0));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> tz.solution(array),
                "Array length is less than 3"
        );

    }

    @Test
    public void testArrayWithOneElement() {
        int[] array = {2};
        Assertions.assertThrows(IllegalArgumentException.class, () -> tz.solution(array),
                "Array length is less than 3"
        );
    }

    @Test
    public void testWithThreeEqualNumbers() {
        int[] array = {10, 10, 10};
        Assert.assertThat(tz.solution(array), Is.is(3));
    }

    @Test
    public void testWithThreeEqualNumbers1() {
        int[] array = {10, 10, 10, 10, 10, 10, 10};
        Assert.assertThat(tz.solution(array), Is.is(3));
    }

    @Test
    public void testCornerCases() {
        int[] array = {10, 10, 1000000000,1000000000,10000000};
        Assert.assertThat(tz.solution(array), Is.is(25));
    }

}
