package com.UserRegistation;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
    private static final String MOBILE_PATTERN = "^([1-9]{1}([-][1-9]{1}[0-9]{1,2}||[0-9]{1,3})) {1}[1-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^[0-9a-zA-Z!@#$%^&*+]{8,}$";

    public boolean validateName(String Name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(Name).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobile) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobile).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
