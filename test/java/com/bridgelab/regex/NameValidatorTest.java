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
		Boolean result = validator.passwordValidation("Amit5@sisodiya");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredFirstValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@yahoo.com");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredSecondValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc-100@yahoo.com");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredThirdValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc.100@yahoo.com");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredFourthValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc-100@abc.net");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredFifthValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc.100@abc.com.au");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredSixthValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@1.com");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredEighthValidEmailShouldPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc+100@gmail.com");
		assertTrue(result);
	}
	
	@Test 
	public void whenEnteredFirstInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredSecondInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@.com.my");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredFouthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc123@.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredFifthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc123@.com.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredSixthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator(".abc@abc.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredSeventhInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc()*@gmail.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredEighthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@%*.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredEleventhInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@abc@gmail.com");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredTwelvethInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@gmail.com.1a");
		assertFalse(result);
	}
	
	@Test 
	public void whenEnteredThirteenthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		NameValidator validator = new NameValidator();
		Boolean result = validator.emailValidator("abc@gmail.com.aa.au");
		assertFalse(result);
	}
}
