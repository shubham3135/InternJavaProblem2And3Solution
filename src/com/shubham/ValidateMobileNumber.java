package com.shubham;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter mobile no:");
        String phoneNumber = sc.next();

        if (isPhoneNumberValid(phoneNumber))
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }

    public static boolean isPhoneNumberValid(String phoneNumber)
    {
        Pattern p = Pattern.compile("([+]91)?[6-9][0-9]{9}");

        Matcher m = p.matcher(phoneNumber);
        return (m.find() && m.group().equals(phoneNumber));
    }
}
