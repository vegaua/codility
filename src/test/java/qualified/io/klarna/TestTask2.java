package qualified.io.klarna;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask2 {

    Task2 t2 = new Task2();

    @Test
    public void test1(){
        Assert.assertThat(t2.numberToOrdinal(8), Is.is("8th"));
    }

    @Test
    public void test2(){
        Assert.assertThat(t2.numberToOrdinal(8930), Is.is("8930th"));
    }

    @Test
    public void test3(){
        Assert.assertThat(t2.numberToOrdinal(841), Is.is("841st"));
    }

    @Test
    public void test4(){
        Assert.assertThat(t2.numberToOrdinal(903), Is.is("903rd"));
    }

    @Test
    public void test5(){
        Assert.assertThat(t2.numberToOrdinal(0), Is.is("0"));
    }

    @Test
    public void test6(){
        Assert.assertThat(t2.numberToOrdinal(122), Is.is("122nd"));
    }


}
