package com.bridegelabz;

import org.junit.Assert;
import org.junit.Test;

public class userValidationTest {
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.userDataValidation("Saiprasad",UserValidator.namePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenAllLowerCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasad",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenTwoCharacterPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("sa",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenAllUpperCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("SAIPRASAD",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Chindam",UserValidator.namePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenAllLowerCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("chindam",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameWhenTwoCharacterPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("ch",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameWhenAllUpperCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("CHINDAM",UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameWhenDigitsEnteredShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234",UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating email address
    @Test
    public void givenEmailIdWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("abc@gmail.com", UserValidator.emailPattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailIdWhenNotProperShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("abc.@gmail.com", UserValidator.emailPattern);
        Assert.assertFalse(result);
    }
    //Test case for validating phone number
    @Test
    public void givenPhoneNumberWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("91 9022744550",UserValidator.phonePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumberWhenCountryCodeImproperShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9131 9034554743",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberWhenCountryCodeNotPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("9867011087",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberWhenPhoneNumberImproperShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("91 986754815",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberWhenFormatImproperShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("919874502631",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumberWhenPhoneNumberNotPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("912 ",UserValidator.phonePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating password minimum 8 characters
    @Test
    public void givenPasswordWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("HelloSaiprasad",UserValidator.passwordRule1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenShortShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("hello",UserValidator.passwordRule1);
        Assert.assertFalse(result);
    }
    //Test case for validating password at-least one Upper case
    @Test
    public void givenPasswordWithAtLeastOneUpperCaseWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Saiprasad",UserValidator.passwordRule2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCaseWhenAllLowerCaseShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasad",UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCaseWhenNumberPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Saichin8080",UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCaseWhenSpecialCharacterPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Sai@#%$%$ggd",UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }
    //Test case for validating password at-least one digit
    @Test
    public void givenPasswordWithAtLeastOneDigitWhenProperShouldReturnTrue() {
        boolean result = UserValidator.userDataValidation("Saiprasad98",UserValidator.passwordRule3);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigitWhenDigitNotPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasadchin",UserValidator.passwordRule3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigitWhenSpecialCharacterPresentShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("Sai@8080",UserValidator.passwordRule3);
        Assert.assertFalse(result);
    }
}
