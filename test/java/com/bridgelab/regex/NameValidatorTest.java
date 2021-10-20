package com.bridgelab.regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameValidatorTest {
	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest1() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("Amit");

		assertTrue(result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("AMit");

		assertTrue(result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest3() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("amit");
		assertFalse(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest1() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("Sisodiya");
		assertTrue(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest2() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("SIsodiya");
		assertTrue(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest3() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.firstNameValidator("sisodiya");
		assertFalse(result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.mobileNumberValidator("91 8097177781");
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest1() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("amitsisodiya@gmail.com");
		assertTrue(result);
	}
	
	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.passwordValidation("Amit5sisodiya");
		assertTrue(result);
	}
}
