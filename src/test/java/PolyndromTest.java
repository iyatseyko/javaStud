import org.junit.Assert;
import org.junit.Test;

import static JavaMethods.Polyndrome.checkIsTheWordAPolindrom;

public class PolyndromTest {

    @Test
    public void verifyIsTheWordAPolyndrom() {
        String polindromPaired= "123qwwq321";
        String polindromUnpaired =  "qwerewq";
        String notPolindrom = "polindrom";

        Assert.assertTrue("" + polindromPaired + " is not a polyndrom", checkIsTheWordAPolindrom(polindromPaired));
        Assert.assertTrue("" + polindromUnpaired + " is not a polyndrom", checkIsTheWordAPolindrom(polindromUnpaired));
        Assert.assertFalse("" + notPolindrom + " is a polyndrom", checkIsTheWordAPolindrom(notPolindrom));
    }
}
