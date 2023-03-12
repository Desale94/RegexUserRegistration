package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void isValidFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);

        if (m.matches()) System.out.println("valid");
        else System.out.println("invalid");

    }

    public static void isValidName(String name) {
        String regex = "^[A-Z][a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);

        if (m.matches()) System.out.println("valid");
        else System.out.println("invalid");

    }

    public static void isValidEmail(String email) {
        String regex = "^[a-z A-z 0-9]+(.[a-zA-Z0-9]+)?@[a-z]+[.][a-z]{2,3}+(.[a-zA-Z0-9]+)?$";
        Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(email);
        if (m.matches()) System.out.println("valid");
        else System.out.println("invalid");

    }
}