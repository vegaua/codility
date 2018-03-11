package testTask;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TelephoneNumberFormatTest {

    TelephoneNumberFormat ct2 = new TelephoneNumberFormat();

    @Test
    public void testWithTwoDigitsOnTheEnd () {
        Assert.assertThat(ct2.solutionRefactored("00-44  48 5555 8361"), Is.is("004-448-555-583-61"));
    }

    @Test
    public void testWithALotOfDashesOnTheEnd () {
        Assert.assertThat(ct2.solutionRefactored("0 - 22 1985--324"), Is.is("022-198-53-24"));
    }

    @Test
    public void testWithThreeDigitsOnTheEnd () {
        Assert.assertThat(ct2.solutionRefactored("555372654"), Is.is("555-372-654"));
    }

    @Test
    public void testN () {
        Assert.assertThat(ct2.solutionRefactored("12345678"), Is.is("123-456-78"));
    }

    @Test
    public void testN1 () {
        Assert.assertThat(ct2.solution("1234567890123456789012"), Is.is("123-456-78"));
    }

    @Test
    public void testGetTelephoneGroupsMethod1() {
        Assert.assertThat(ct2.getTelephoneNumberGroups("12345678", 2, 3,0),
                Is.is(Arrays.asList("123","456")));
    }

    @Test
    public void testGetTelephoneGroupsMethod2() {
        Assert.assertThat(ct2.getTelephoneNumberGroups("12345678", 1, 2,6),
                Is.is(Arrays.asList("78")));
    }


}
