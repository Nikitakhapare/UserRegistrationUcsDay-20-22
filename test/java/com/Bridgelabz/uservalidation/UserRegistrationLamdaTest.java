package com.Bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationLamdaTest {

	UserRegistrationLamda userRegistration=new UserRegistrationLamda();
	@Test
    public void givenFirstNameValid() {
        boolean result = userRegistration.firstName.validate("Nikita");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid() {
        boolean result = userRegistration.firstName.validate("niki");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenLastNameValid() {
        boolean result = userRegistration.lastName.validate("Gajra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid() {
        boolean result = userRegistration.lastName.validate("gajra");
        Assert.assertFalse(result);
    }
    
    @Test
    public void givenMobileNoValid() {
        boolean result = userRegistration.phoneNomber.validate("91 9876543215");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoInValid() {
    	boolean result = userRegistration.phoneNomber.validate("987456321091");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailValid() {
    	boolean result = userRegistration.eMail.validate("rash@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid() {
    	boolean result = userRegistration.eMail.validate("abc@#gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordValid() {
    	boolean result = userRegistration.password.validate("H@4hdgubkjn");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordInValid() {
    	boolean result = userRegistration.password.validate("69ndkHkm");
        Assert.assertFalse(result);
    }

}
