package com.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    UserRegistration userregistration = new UserRegistration();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenFirstLetterCapital_thenReturnTrue() throws UserException{
        String name = "Manali";
        try {
        boolean firstName = userregistration.validateFirstName(name);
        //Assert.assertTrue(firstName);
    } catch (UserException e){
            Assert.assertEquals(UserException.ExceptionType.Invalid_First_Name, e.type);
        }
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenFirstLetterNotCapital_thenReturnFalse() {
        String name = "manali";
        try {
        boolean firstName = userregistration.validateFirstName(name);
        //Assert.assertFalse(firstName);
        } catch (UserException e){
            Assert.assertEquals(UserException.ExceptionType.Invalid_First_Name, e.type);
        }
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenLastLetterCapital_thenReturnTrue()  {
        String name = "Parab";
        try {
            boolean lastName = userregistration.validateLastName(name);
            Assert.assertFalse(lastName);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenLastLetterNotCapital_thenReturnFalse() {
        String name = "parab";
        try {
        boolean lastName = userregistration.validateLastName(name);
        Assert.assertFalse(lastName);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK  EMAIL ID VALID
    @Test
    public void givenEmailID_whenValid_thenReturnTrue() {
        String emailID = "abc.xyz@bl.co.in";
        try {
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertTrue(emailName);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK EMAIL ID INVALID
    @Test
    public void givenEmailID_whenInvalid_thenReturnFalse() {
        String emailID = "abc";
        try {
        boolean emailName = userregistration.validateEmailID(emailID);
        Assert.assertFalse(emailName);
        } catch (UserException e) {
            Assert.assertEquals(UserException.ExceptionType.Invalid_Last_Name, e.type);
        }
    }

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumber_whenValid_thenReturnTrue() {
        String number = "91 9919819801";
        try {
        boolean mobileNumber = userregistration.validateMobileNumber(number);
        Assert.assertTrue(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumber_whenInvalid_thenReturnFalse() {
        String number = "9919813";
        boolean mobileNumber = userregistration.validateMobileNumber(number);
        Assert.assertFalse(mobileNumber);
    }

    //TEST TO CHECK PASSWORD RULE ONE VALID
    @Test
    public void givenPassword_whenMinimum8Characters_thenReturnTrue() {
        String password = "manaliparab";
        boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        Assert.assertTrue(passwordOne);
    }

    //TEST TO CHECK PASSWORD RULE ONE INVALID
    @Test
    public void givenPassword_whenNotMinimum8Characters_thenReturnFalse() {
        String password = "manali";
        boolean passwordOne = userregistration.validatePasswordRuleOne(password);
        Assert.assertFalse(passwordOne);
    }

    //TEST TO CHECK PASSWORD RULE TWO VALID
    @Test
    public void givenPassword_whenAtLeast1UpperCase_thenReturnTrue() {
        String password = "Manaliparab";
        boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        Assert.assertTrue(passwordTwo);
    }
    //TEST TO CHECK PASSWORD RULE TWO INVALID
    @Test
    public void givenPassword_whenNotContainUpperCase_thenReturnFalse() {
        String password = "manaliparab";
        boolean passwordTwo = userregistration.validatePasswordRuleTwo(password);
        Assert.assertFalse(passwordTwo);
    }

    //TEST TO CHECK PASSWORD RULE THREE VALID
    @Test
    public void givenPassword_whenAtLeast1Number_thenReturnTrue() {
        String password = "Manali12";
        boolean passwordThree= userregistration.validatePasswordRuleThree(password);
        Assert.assertTrue(passwordThree);
    }


    //TEST TO CHECK PASSWORD RULE THREE INVALID
    @Test
    public void givenPassword_whenNotContainNumber_thenReturnFalse() {
        String password = "manaliparab";
        boolean passwordThree = userregistration.validatePasswordRuleThree(password);
        Assert.assertFalse(passwordThree);
    }

    //TEST TO CHECK PASSWORD RULE FOURE VALID
    @Test
    public void givenPassword_whenHasSpecialCharacters_thenReturnTrue() {
        String password = "Manali#12";
        boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
        Assert.assertTrue(passwordFoure);
    }

    //TEST TO CHECK PASSWORD RULE FOURE INVALID
    @Test
    public void givenPassword_whenNotContainSpecialCharacters_thenReturnFalse() {
        String password = "manali123";
        boolean passwordFoure = userregistration.validatePasswordRuleFour(password);
        Assert.assertFalse(passwordFoure);
    }
}


