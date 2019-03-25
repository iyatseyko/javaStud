import org.junit.Assert;
import org.junit.Test;

import static JavaMethods.MathOperation.*;

public class MathOpetationsTest {

    int[] integers = {1, 4, 6, 8, 9, 5};
    private static final double DELTA = 1e-15;

    @Test
    public void VerifyIsMinMethodWorkCorrect() {
        Assert.assertEquals("Expected result is 1, but ectual result is " + min(integers) + "!", 1, min(integers));
    }

    @Test
    public void VerifyIsMaxMethodWorkCorrect() {
        Assert.assertEquals("Expected result is 9, but ectual result is " + max(integers) + "!", 9, max(integers));
    }

    @Test
    public void VerifyIsAverageMethodWorkCorrect() {
        Assert.assertEquals(5.5, average(integers), DELTA);
    }
}

