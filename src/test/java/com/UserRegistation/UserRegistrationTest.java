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

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Ilaf");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Il");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenLastName_WhenStartWithSmallLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("ilaf");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenLastName_WhenHaveNumbers_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Ilaf03");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenLastName_WhenHaveSpecialCharacters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateName("Il@f");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateEmail("ilafkaladiya@gmail.com");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenEmail_WhenMissingMandotarySymbols_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateEmail("ilafkaladiyagmail.com");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenEmail_WhenMissingCompulsoryPart_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateEmail("ilafkaladiya@gmail.");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateMobileNumber("91 9199527878");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validateMobileNumber("9594523623");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validatePassword("Ilaf4567");
        Assert.assertTrue(validationResult);
    }

    @Test
    public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validatePassword("ila45");
        Assert.assertFalse(validationResult);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validationResult = userRegistration.validatePassword("ila45");
        Assert.assertFalse(validationResult);
    }

}
