package com.Bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTryCatchTest {
	
 UserRegistrationTryCatch userRegistration=new UserRegistrationTryCatch();
 @Test
 public void givenFirstNameHappy () {
	 try {
		 Assert.assertTrue(userRegistration.firstName("Niki"));
		 System.out.println("Valid First Name");
	 }catch(UserREgistrationException e) {
	 System.out.println(e.getMessage());
 }
 }
 @Test
 public void givenFirstNameSad() {
     try {
         Assert.assertTrue(userRegistration.firstName("mohammed"));
         System.out.println("Valid First Name");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenLastNameHappy() {
     try {
         Assert.assertTrue(userRegistration.lastName("Atif"));
         System.out.println("Valid Last Name");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenLastNameSad() {
     try {
         Assert.assertTrue(userRegistration.lastName("atif"));
         System.out.println("Valid Last Name");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenEmailHappy() {
     try {
         Assert.assertTrue(userRegistration.isValidEmail("abc@gmail.com"));
         System.out.println("Valid Email");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenEmailSad() {
     try {
         Assert.assertTrue(userRegistration.isValidEmail("abc@gmail@.com@"));
         System.out.println("Valid Email");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenMobileNoHappy() {
     try {
         Assert.assertTrue(userRegistration.mobileNumberValidate("91 9876543210"));
         System.out.println("Valid Mobile Number");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }

 @Test
 public void givenMobileNoSad() {
     try {
         Assert.assertTrue(userRegistration.mobileNumberValidate("20876543210"));
         System.out.println("Valid Mobile Number");
     } catch (UserREgistrationException e) {
         System.out.println(e.getMessage());
     }
 }
 @Test
	public void givenPasswordHappy() {
		try {
			boolean result = userRegistration.passwordValidate("sgduf45yd");
			Assert.assertTrue(result);
		}catch(UserREgistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPasswordSad() {
		try {
			boolean result = userRegistration.passwordValidate("jdvhg");
			Assert.assertTrue(result);
		}catch(UserREgistrationException e) {
			System.out.println(e.getMessage());
		}
	}
}