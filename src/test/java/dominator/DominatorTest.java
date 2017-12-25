package dominator;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DominatorTest {

    Dominator dominator = new Dominator();

    @Test
    public void testSolutionWithSixDominatorElementsFromEleven() {
        int[] array = {3, 6, 3, 90, 3, 3, 6, 1, 3, 3};
        assertThat(dominator.solution(array), is(0));
    }

    @Test
    public void testSolutionWithFiveDominatorElementsFromTen() {
        int[] array = {3, 6, 3, 90, 3, 3, 6, 1, 3, 5 };
        assertThat(dominator.solution(array), is(-1));
    }

    @Test
    public void testSolutionWithTwoDominators() {
        int[] array = {0,0,0,0,0,2,2,2,2,2,1 };
        assertThat(dominator.solution(array), is(-1));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertThat(dominator.solution(array), is(-1));
    }

    @Test
    public void testWithOneElement() {
        int[] array = {1};
        assertThat(dominator.solution(array), is(0));
    }

    @Test
    public void testWithHugeNumbers() {
        int[] array = new int[10000];
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)(Math.random()*3 );
        }
        assertThat(dominator.solution(array), is(-1));
    }

}
