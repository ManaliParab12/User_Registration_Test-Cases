package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserRegistration {

    String firstNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
    String lastNamePattern = "^[A-Z]{1}[ a-z]{2,25}";
    String emailPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Validation");
    }

    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    public boolean validateLastName(String lastName) {
        return (Pattern.matches(lastNamePattern,lastName));
    }

    public boolean validateEmailID(String emailID) {
        return (Pattern.matches(emailPattern,emailID));
    }
}
