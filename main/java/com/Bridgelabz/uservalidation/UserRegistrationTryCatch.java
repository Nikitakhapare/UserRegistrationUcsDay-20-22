package com.Bridgelabz.uservalidation;

public class UserRegistrationTryCatch {
public boolean firstName(String firstName) throws UserREgistrationException{
	try {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = firstName.matches(pattern);
		return result;
	    }catch(Exception e)
	{
	    	throw new UserREgistrationException("Invalid Entry!");
     }
}
public boolean lastName(String name) throws UserREgistrationException {
	try {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(pattern);
		return result;
	} catch (Exception e) {
		throw new UserREgistrationException("Invalid Entry!");
	}
}
public boolean mobileNumberValidate(String number) throws UserREgistrationException {
	try {
		String pattern = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
		boolean result = number.matches(pattern);
		return result;
	} catch (Exception e) {
		throw new UserREgistrationException("Invalid Entry!");
	}
}

public boolean isValidEmail(String email) throws UserREgistrationException {
	try {
		String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
		boolean result = email.matches(emailPattern) ;
		return result;
	} catch (Exception e) {
		throw new UserREgistrationException("Invalid Entry!");
	}
}

public boolean passwordValidate(String password) throws UserREgistrationException {
	try {
		String pattern = "^[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	} catch (Exception e) {
		throw new UserREgistrationException("Invalid Entry!");
	}
}
}