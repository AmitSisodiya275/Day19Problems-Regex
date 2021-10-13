package com.bridgelab.regex;

import java.util.regex.Pattern;

public class NameValidator {

	public static final String NAME_VALIDATOR = "^[A-Z]{1}[a-zA-z]{2,}$";

	public boolean firstNameValidator(String firstName) {

		return Pattern.matches(NAME_VALIDATOR, firstName);
	}
}
