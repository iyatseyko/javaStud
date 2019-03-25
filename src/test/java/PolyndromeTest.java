import org.junit.Assert;
import org.junit.Test;

import static JavaMethods.Polyndrome.checkIsTheWordAPolindrom;

public class PolyndromeTest {

    @Test
    public void verifyIsTheWordAPolyndrom() {
        String polindromPaired =  "asddsa";
        String polindromUnPaired = "qwe12321ewq";
        String notPolindrom = "";

        Assert.assertTrue("Method verify incorrect", checkIsTheWordAPolindrom(polindromPaired));
        Assert.assertTrue("Method verify incorrect", checkIsTheWordAPolindrom(polindromUnPaired));
        Assert.assertFalse("Method verify incorrect", checkIsTheWordAPolindrom(notPolindrom));
    }
}
