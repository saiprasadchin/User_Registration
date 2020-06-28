package com.bridegelabz;

import org.junit.Assert;
import org.junit.Test;

public class userValidationTest {
    @Test
    public void givenFirstName_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("Saiprasad", UserValidator.namePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenAllLowerCase_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasad", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenTwoCharacterPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("sa", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameWhenAllUpperCaseShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("SAIPRASAD", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenDigitsEntered_ShouldReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234", UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("Chindam", UserValidator.namePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenAllLowerCaseShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("chindam", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenTwoCharacterPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("ch", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenAllUpperCaseShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("CHINDAM", UserValidator.namePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenDigitsEnteredShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("1234", UserValidator.namePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating email address
    @Test
    public void givenEmailId_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("abc@gmail.com", UserValidator.emailPattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProperShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("abc.@gmail.com", UserValidator.emailPattern);
        Assert.assertFalse(result);
    }
    //Test case for validating phone number
    @Test
    public void givenPhoneNumber_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("91 9022744550", UserValidator.phonePattern);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeImproperShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("9131 9034554743", UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeNotPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("9867011087", UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberImproperShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("91 986754815", UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenFormatImproperShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("919874502631", UserValidator.phonePattern);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberNotPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("912 ", UserValidator.phonePattern);
        Assert.assertFalse(result);
    }
    //Test case for validating password minimum 8 characters
    @Test
    public void givenPassword_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("HelloSaiprasad", UserValidator.passwordRule1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShortShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("hello", UserValidator.passwordRule1);
        Assert.assertFalse(result);
    }
    //Test case for validating password at-least one Upper case
    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("Saiprasad", UserValidator.passwordRule2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenAllLowerCaseShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasad", UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenNumberPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("Saichin8080", UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneUpperCase_WhenSpecialCharacterPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("Sai@#%$%$ggd", UserValidator.passwordRule2);
        Assert.assertFalse(result);
    }
    //Test case for validating password at-least one digit
    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("Sai80prasad", UserValidator.passwordRule3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenDigitNotPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("saiprasadchin", UserValidator.passwordRule3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordWithAtLeastOneDigit_WhenSpecialCharacterPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("Sai@8080", UserValidator.passwordRule3);
        Assert.assertFalse(result);
    }
    //Test case for validating password exactly one special characters
    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenProperShould_ReturnTrue() {
        boolean result = UserValidator.userDataValidation("Saiprasad@80", UserValidator.passwordRule4);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenSpecialCharactersNotPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("Saipras123", UserValidator.passwordRule4);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenAllLowerCaseShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("saipras@80", UserValidator.passwordRule4);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassowrdWithExactOneSpecialCharacter_WhenNumberNotPresentShould_ReturnFalse() {
        boolean result = UserValidator.userDataValidation("Sai@chindam", UserValidator.passwordRule4);
        Assert.assertFalse(result);
    }
}
