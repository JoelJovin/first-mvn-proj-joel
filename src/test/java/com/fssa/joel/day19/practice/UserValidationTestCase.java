package com.fssa.joel.day19.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTestCase {

//	user.setEmail("apjoel2002@gmail.com");
//	user.setPassword("Joel02");
	
	//Test Case for Id
	@Test
	public void testId() {
		Assertions.assertTrue(User.validateId(1));
	}
	
	
	@Test
	public void testIdException() {
		try {
			Assertions.assertTrue(User.validateId(-1));
			Assertions.fail("ValidateId failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("ID should be positive.", ex.getMessage());
		}
	}
	
	//Test Case for UserName
	@Test
	public void testUserName() {
		Assertions.assertTrue(User.validateName("joel"));
	}
	
	@Test
	public void testUserNameException() {
		try {
			Assertions.assertTrue(User.validateName("jo"));
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Name should have a minimum length of 2 characters.", ex.getMessage());
		}
	}
	
	@Test
	public void testUserNameNullException() {
		try {
			Assertions.assertTrue(User.validateName(null));
			Assertions.fail("ValidateName failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Name should have a minimum length of 2 characters.", ex.getMessage());
		}
	}
	
	
	//Test Case for UserEmail
	@Test
	public void testUserEmail() {
		Assertions.assertTrue(User.validateEmail("apjoel2002@gmail.com"));
	}
	
	@Test
	public void testUserEmailException() {
		try {
			Assertions.assertTrue(User.validateEmail("jo"));
			Assertions.fail("ValidateName failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid email format.", ex.getMessage());
		}
	}
	

	//Test Case for UserPassword
	@Test
	public void testUserPassword() {
		Assertions.assertTrue(User.validatePassword("Joel@2002"));
	}
	
	@Test
	public void testUserPasswordException() {
		try {
			Assertions.assertTrue(User.validatePassword("hello"));
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid password format.", ex.getMessage());
		}
	}
	

}