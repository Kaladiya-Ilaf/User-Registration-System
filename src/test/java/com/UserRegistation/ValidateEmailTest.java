package com.UserRegistation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ValidateEmailTest {

    public String testingEmails;
    public boolean expectedResult;

    public ValidateEmailTest(){}

    public ValidateEmailTest(String email, boolean expectedResult){
        this.testingEmails = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", false},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", false},
                {"abc@1.com", true},
                {"abc@gmail.com.com", false},
                {"abc+100@gmail.com", false}
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail(this.testingEmails);
        Assert.assertEquals(this.expectedResult, result);
    }

}
