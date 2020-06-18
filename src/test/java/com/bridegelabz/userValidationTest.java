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
}
