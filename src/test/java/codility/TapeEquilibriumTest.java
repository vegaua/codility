package codility;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TapeEquilibriumTest {

    @Test
    public void simpleTest() {
        int[] array = {3, 1, 2, 4, 3};
        assertThat(new TapeEquilibrium().solution(array), is(1));
    }

    @Test
    public void testWithZeroes() {
        int[] array = {0,0,0,0,0,0,0,0,0,0,0};
        assertThat(new TapeEquilibrium().solution(array), is(0));
    }

    @Test
    public void testWithMinimumLength() {
        int[] array = {3, 1};
        assertThat(new TapeEquilibrium().solution(array), is(2));
    }

    @Test
    public void testWithMinimumZeroes() {
        int[] array = {0,0};
        assertThat(new TapeEquilibrium().solution(array), is(0));
    }

    @Test
    public void testWithMinusNumbers() {
        int[] array = {0,-2,-4,-8,9,-1};
        assertThat(new TapeEquilibrium().solution(array), is(2));
    }

    @Test
    public void testWithOnlyMinusNumbers() {
        int[] array = {-1,-2,-3};
        assertThat(new TapeEquilibrium().solution(array), is(0));
    }


}
