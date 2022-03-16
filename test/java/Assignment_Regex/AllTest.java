package Assignment_Regex;

import org.junit.Assert;
import org.junit.Test;

public class AllTest {

    @Test
    public void firstNameTestingNullP0interException() {
        FirstName firstName = new FirstName();
        boolean valid = firstName.firstName1(null);
        Assert.assertEquals(true,valid);
    }

    @Test
    public void firstNameTestingHappy() throws Exception {
        FirstName firstName = new FirstName();
        String valid = firstName.firstName2("Ravi");
        Assert.assertEquals("Happy",valid);
    }

    @Test
    public void firstNameTestingSad() throws Exception {
        FirstName firstName = new FirstName();
        String valid = firstName.firstName2("Rahul");
        Assert.assertEquals("Sad",valid);
    }

    @Test
    public void lastNameTestingHappy() throws Exception {
        LastName lastName = new LastName();
        String valid = lastName.lastName2("Boti");
        Assert.assertEquals("Happy",valid);
    }

    @Test
    public void lastNameTestingSad() throws Exception {
        LastName lastName = new LastName();
        String valid = lastName.lastName2("Bharat");
        Assert.assertEquals("Sad",valid);
    }

    @Test
    public void emailTestingNullP0interException() {
        Email em = new Email();
        boolean valid = em.email1(null);
        Assert.assertEquals(true,valid);
    }

    @Test
    public void emailTestingThrowNullPointerExceptionHappy() throws Exception {
        Email em1 = new Email();
        String valid = em1.email2(null);
        Assert.assertEquals("Happy",valid);
    }

    @Test
    public void emailTestingSad() throws Exception {
        Email em1 = new Email();
        String valid = em1.email2("pra95@gmail.com");
        Assert.assertEquals("Sad",valid);
    }

    @Test
    public void passWordTestingHappyCase() throws Exception {
        Password password = new Password();
        String valid = password.passWord2("Pra95@");
        Assert.assertEquals("Happy",valid);
    }

    @Test
    public void mobileNumberTestingHappyCase() throws Exception {
        MobileNumber mobileNumber = new MobileNumber();
        String valid = mobileNumber.mobile_Number2("9856523581");
        Assert.assertEquals("Happy",valid);
    }
}
