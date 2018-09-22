package qualified.io.klarna;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestGlassDoorQuestionsKlarna {

    GlassDoorQuestionsKlarna gdKlarna = new GlassDoorQuestionsKlarna();

    @Test
    public void testDigitAdditionToArray() {
        int [] array = {1,2,3};
        int [] result = {1,2,4};
        Assert.assertThat(gdKlarna.addDigitToANumberAsArray(array,1), Is.is(result));
    }

    @Test
    public void testDigitAdditionToEmptyArray() {
        int [] array = {};
        int [] result = {1};
        Assert.assertThat(gdKlarna.addDigitToANumberAsArray(array,1), Is.is(result));
    }

    @Test
    public void testZeroAdditionToArray() {
        int [] array = {1,0,0};
        int [] result = {1,0,0};
        Assert.assertThat(gdKlarna.addDigitToANumberAsArray(array,0), Is.is(result));
    }

    @Test
    public void testHugeDigitAdditionToArray() {
        int [] array = {9,9,9};
        int [] result = {1,0,0,0,9,9,9};
        Assert.assertThat(gdKlarna.addDigitToANumberAsArray(array,1000000), Is.is(result));
    }

    @Test
    public void testMultiples () {
        gdKlarna.printMultiplesOfNumber(3);
    }

    @Test
    public void testIntegersSort() {
        Assert.assertThat(gdKlarna.sortNumbers("9 0 8 900 23 45 12 1 2 0"), Is.is("0 0 1 2 8 9 12 23 45 900"));
    }
}
