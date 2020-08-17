package com.UserRegistation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Ilaf");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Il");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenFirstName_WhenStartWithSmallLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("ilaf");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenFirstName_WhenHaveNumbers_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Ilaf03");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenFirstName_WhenHaveSpecialCharacters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Il@f");
        Assert.assertFalse(validationResult);
    }
}
