package testTask;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UniqueIdTest extends Thread {

    UniqueId uId = new UniqueId();

    @Test
    public void generateIds() {
        Thread thread1 = new UniqueIdTest();
        Thread thread2 = new UniqueIdTest();

        Long startTime = System.currentTimeMillis();

        thread1.run();
        thread2.run();

        Long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
        System.out.println("duplication attempts: " + uId.count);

        Assert.assertThat(Ids.existingIds.size(), Is.is(1));
    }

    public void run() {
        int idsAmount = 10000;
        for (int i = 0; i < idsAmount; i++) {
            uId.generateUniqueId();
        }
    }
}
