package com.bridgealb.regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelab.regex.NameValidator;

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
}
