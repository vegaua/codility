package qualified.io.klarna;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask3 {

    Task3 t3 = new Task3();

    @Test
    public void test1(){
            Assert.assertThat(t3.evaluate("3 2 1 - *"), Is.is(3.0));
    }

    @Test
    public void test2(){
        Assert.assertThat(t3.evaluate("7 4 5 + * 3 - 10 /"), Is.is(6.0));
    }

    @Test
    public void test3(){
        Assert.assertThat(t3.evaluate("7 4 5 3 10"), Is.is(10.0));
    }
}
