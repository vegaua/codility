package codility.tipico;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask3 {

    Task3 task3 = new Task3();

    @Test
    public void lowerCaseTest() {
        Assert.assertThat(task3.solution("digit"), Is.is("lower"));
    }

    @Test
    public void upperCaseTest() {
        Assert.assertThat(task3.solution("Upper"), Is.is("upper"));
    }

    @Test
    public void digitTest() {
        Assert.assertThat(task3.solution("7328"), Is.is("digit"));
    }

    @Test
    public void otherTest() {
        Assert.assertThat(task3.solution("!!"), Is.is("other"));
    }
}
