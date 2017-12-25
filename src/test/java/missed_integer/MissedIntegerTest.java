package missed_integer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;

public class MissedIntegerTest {

    @Test
    public void shouldReturnFive() {
        int [] array = { 3, 6, 4};
        assertThat(new MissedInteger().solution(array), is(5));
    }

    @Test
    public void shouldReturnOne() {
        int [] array = {-60,-40,-1,-3};
        assertThat(new MissedInteger().solution(array), is(1));
    }

    @Test
    public void shouldReturnNine() {
        int [] array = {9};
        assertThat(new MissedInteger().solution(array), is(9));
    }

    @Test
    public void shouldReturnFour() {
        int [] array = {1,2,3};
        assertThat(new MissedInteger().solution(array), is(4));
    }
}
