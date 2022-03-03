package com.Bridgelabz.uservalidation;

public class UserRegistrationLamda {
	final String nameValidate = "^[A-Z][a-z]{2,}$";
	final String mobileValidate = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
	final String emailValidate = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
	final String passwordValidate = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
	
	UserValidatorLamda firstName = (regex) -> (regex.matches(nameValidate));
	UserValidatorLamda lastName = (regex) -> (regex.matches(nameValidate));
	UserValidatorLamda phoneNomber=(regex) -> (regex.matches(mobileValidate));
	UserValidatorLamda eMail=(regex) -> (regex.matches(emailValidate));
	UserValidatorLamda password=(regex) -> (regex.matches(passwordValidate));
}
