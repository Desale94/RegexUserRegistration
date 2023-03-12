package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void isValidFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);

        if (m.matches()) System.out.println("valid");
        else System.out.println("invalid");

    }
    public static void isValidName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);

        if (m.matches()) System.out.println("valid");
        else System.out.println("invalid");

    }
}