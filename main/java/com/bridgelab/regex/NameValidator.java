package com.bridgelab.regex;

import java.util.regex.Pattern;

public class NameValidator {

	public static final String NAME_VALIDATOR = "^[A-Z]{1}[a-zA-z]{2,}$";
	public static final String NUMBER_VALIDATOR = "^[0-9]{2}[ ]{1}[0-9]{10}$";
	public static final String EMAIL_VALIDATIOR ="^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}";

	public boolean firstNameValidator(String firstName) {

		return Pattern.matches(NAME_VALIDATOR, firstName);
	}

	public boolean lastNameValidator(String firstName) {

		return Pattern.matches(NAME_VALIDATOR, firstName);
	}

	public boolean mobileNumberValidator(String mobNumber) {
		return Pattern.matches(NUMBER_VALIDATOR, mobNumber);
	}
	
	public boolean emailValidator(String email) {
		return Pattern.matches(EMAIL_VALIDATIOR, email);
	}
}
