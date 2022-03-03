package com.Bridgelabz.uservalidation;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class AllEmailParameterisedTest {
private AllEmailParameterised email;
private boolean expectedOutput;
private String myEmail;
@Before
public void initilize() {
	email=new AllEmailParameterised(); 
}
public AllEmailParameterisedTest(String email,boolean validity) {
	 this.myEmail = email;
	 this.expectedOutput = validity;
}
@Parameterized.Parameters
  public static Collection<Object[]> primeNumbers() {
     return Arrays.asList(new Object[][] {
        { "abc@yahoo.com", true },
        { "abc", false },
        { "abc-100@yahoo.com", true },
        { "abc123@gmail.a", false },
        { "abc@1.com", true }
     });
  }
@Test
   public void givenEmailsList1_ShouldReturnValidity() {
	 System.out.println("email : " + myEmail);
     Assert.assertEquals(expectedOutput,email.validEmail(myEmail));
   }
}
