import org.junit.Assert;
import org.junit.Test;

import static StudyProject.StringOperations.StringReverse.stringReverse;

public class ReverseStringTest {

    @Test
    public void VerifyIsreverseStringMethodWorkCorrect () {
        String inputString = "";
        String isNull = null;

        Assert.assertEquals("Expected result is 987654321, but ectual result is " + stringReverse(inputString) + "!", "987654321", stringReverse(inputString) );
        Assert.assertEquals("Expected result is '', but ectual result is " + stringReverse(isNull) + "!", "", stringReverse(isNull) );

    }
}
