import myarray.ArrayExample2;
import myarray.ArrayExampleImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ArrayExampleTest {
    private ArrayExample2 arrayExample = new ArrayExampleImpl();


    @Test
    public void sum() {
        int[] data = {20, 6, 5, 10, 15, 3, 0};
        int sum = arrayExample.sum(data);
        assertTrue(sum == 59 && data.length > 0);
    }

    @Test
    public void count() {
        int[] data = {1, 1, 1, 1, 11, 1, 1, 5};
        int count = arrayExample.count(data);
        assertTrue(count == 6);
    }

    @Test
    public void avg() {
        int[] data = {10, 10, 10, 10, 10, 10};
        float avg = arrayExample.avg(data);
        assertTrue(avg == 10);
    }
}
