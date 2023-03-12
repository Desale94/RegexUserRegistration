package com.bridgelabz.regex;

import java.util.Scanner;

public class Main {
    static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--Welcome to User Registration Problem--");
        checkFirstName();
        checkLastName();

    }

    public static void checkFirstName() {
        System.out.print("Enter first name: ");
        String fName = SC.next();
        UserRegistration.isValidFirstName(fName);
    }
    public static void checkLastName() {
        System.out.print("Enter first name: ");
        String lName = SC.next();
        UserRegistration.isValidName(lName);
    }
}

