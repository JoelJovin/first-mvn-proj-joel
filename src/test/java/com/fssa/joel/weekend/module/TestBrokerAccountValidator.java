package com.fssa.joel.weekend.module;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBrokerAccountValidator {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(BrokerAccountValidator.ValidateName("Joel"));
	}
//  for valid Email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(BrokerAccountValidator.validateEmail("joel@gmail.com"));
	}
	@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(BrokerAccountValidator.validatePhoneNumber("9080096570"));
	}
	@Test
	public void testValidPinCode() {
		Assertions.assertTrue(BrokerAccountValidator.validatePinCode("628001"));
	}
	@Test
	public void testValidPlace() {
		Assertions.assertTrue(BrokerAccountValidator.validatePlace("Taramani"));
	}
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(BrokerAccountValidator.validatePassword("Joel@#2002"));
	}
}