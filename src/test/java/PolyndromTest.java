import org.junit.Assert;
import org.junit.Test;

import static JavaMethods.Polyndrom.checkIsTheWordAPolindrom;

public class PolyndromTest {

    @Test
    public void verifyIsTheWordAPolyndrom() {
        String word =  "qwerewq";

        Assert.assertTrue("" + word + " is not a polyndrom", checkIsTheWordAPolindrom(word));

    }
}
