package flixBus;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Task2Test {

    Task2 task2 = new Task2();

    @Test
    public void task2Test1 () {
        Assert.assertThat(Task2.compressedString("abaabbbc"), Is.is("aba2b3c"));
    }

    @Test
    public void task2Test2 () {
        Assert.assertThat(Task2.compressedString("wwww"), Is.is("w4"));
    }
}
