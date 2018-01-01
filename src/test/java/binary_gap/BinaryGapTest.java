package binary_gap;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testCaseWithoutBinaryGap () {
        assertThat(binaryGap.solution(15), is(0));
    }

    @Test
    public void shouldReturnOneForZeroValue () {
        assertThat(binaryGap.solution(0), is(0));
    }

    @Test
    public void shouldReturnZeroForValueOne () {
        assertThat(binaryGap.solution(1), is(0));
    }

    @Test
    public void shouldReturnLongestBinaryGap () {
        assertThat(binaryGap.solution(529 ), is(4)); // binary representation 1000010001
    }

    @Test
    public void testIfSolutionWorksOnlyForGaps () {
        assertThat(binaryGap.solution(1024 ), is(0)); // binary representation 10000000000
        assertThat(binaryGap.solution(51712 ), is(2)); // binary representation 110010100000000
        assertThat(binaryGap.solution(20 ), is(1)); // binary representation 101
        assertThat(binaryGap.solution(328 ), is(2)); // binary representation 101001000
        assertThat(binaryGap.solution(16 ), is(0)); // binary representation
    }

}
