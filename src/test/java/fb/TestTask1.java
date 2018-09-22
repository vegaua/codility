package fb;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask1 {

    Task1 t1 = new Task1();

    @Test
    public void test1(){
        Assert.assertThat(t1.isPangram("The quick brown fox jumps over the lazy dog"), Is.is(true));
    }
}
