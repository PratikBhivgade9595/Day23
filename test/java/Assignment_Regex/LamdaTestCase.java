package Assignment_Regex;

import org.junit.Assert;
import org.junit.Test;

public class LamdaTestCase {
    UsingLamdaInterface usingLamdaInterface = new UsingLamdaInterface();

    @Test
    public void firstNameValidCase() {
       boolean valid = usingLamdaInterface.fN.value("Pratik");
        Assert.assertTrue(valid);
    }

    @Test
    public void firstNameInValidCase() {
        boolean inValid = usingLamdaInterface.fN.value("pratik");
        Assert.assertFalse(inValid);
    }

    @Test
    public void mobileNumberValidCase() {
        boolean valid = usingLamdaInterface.mN.value("+919542312537");
        Assert.assertTrue(valid);
    }

    @Test
    public void mobileNumberInValidCase() {
        boolean inValid = usingLamdaInterface.mN.value("+91954231253756");
        Assert.assertFalse(inValid);
    }

    @Test
    public void emailValidCase() {
        boolean valid = usingLamdaInterface.eV.value("pratik125@gmail.com");
        Assert.assertTrue(valid);
    }

    @Test
    public void emailInValidCase() {
        boolean inValid = usingLamdaInterface.eV.value("pratik125.@gmail.com");
        Assert.assertFalse(inValid);
    }

    @Test
    public void passwordValidCase() {
        boolean valid = usingLamdaInterface.pW.value("praTik123@");
        Assert.assertTrue(valid);
    }

    @Test
    public void passwordInValidCase() {
        boolean inValid = usingLamdaInterface.pW.value("pra@Tik123@");
        Assert.assertFalse(inValid);
    }
}
