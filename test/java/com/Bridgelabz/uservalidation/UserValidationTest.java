package com.Bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class UserValidationTest {
private UserValidation user;
	@Before
public void initialize(){
  user=new UserValidation();	
}
@Test
public void givenFirstNameHappy(){	
	boolean result = user.firstName("Niki");
    Assert.assertTrue(result);
}
@Test
public void givenFirstNameSad(){	
	boolean result = user.firstName("niki");
    Assert.assertFalse(result);
}
@Test
public void givenLastNameHappy(){	
	boolean result = user.lastName("Khapare");
    Assert.assertTrue(result);
}
@Test
public void givenLastNameSad(){	
	boolean result = user.lastName("khapare");
    Assert.assertFalse(result);
}
@Test
public void givenEmailHappy() {
	boolean result=user.eMail("nikitakhapare53@gmail.com");
	Assert.assertTrue(result);
}
@Test
public void givenEmailSad() {
	boolean result=user.eMail("nikitSgmail.com");
	Assert.assertFalse(result);
}
@Test
public void givenPasswordHappy() {
	boolean result=user.password("H27@jkih");
	Assert.assertTrue(result);
}
@Test
public void givenPasswordSad() {
	boolean result=user.password("nikiS1");
	Assert.assertFalse(result);
}
}



