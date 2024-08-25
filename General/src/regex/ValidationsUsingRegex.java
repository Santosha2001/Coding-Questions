package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationsUsingRegex {

    public static boolean isValidEmail(String email) {
        // Regular expression for email validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // pan number regex
    public static boolean isValidPanNumber(String panNumber) {
        // Regular expression for email validation
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(panNumber);
        return matcher.matches();
    }

    //  number regex
    public static boolean isValidNumber(String number) {
        // Regular expression for email validation
        String regex = "^[6-9]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    //  pin code regex
    public static boolean isValidPinCode(String pin) {
        // Regular expression for email validation
        String regex = "^[1-9][0-9]{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // email regex
        String email = "user@gmail.com";
        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        // pan regex
        String pan = "cjdpc8700m";
        if (isValidPanNumber(pan.toUpperCase())) {
            System.out.println("Valid pan number.");
        } else {
            System.out.println("Invalid pan number.");
        }

        // number regex
        String number = "7022590204";
        if (isValidNumber(number)) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.");
        }

        // pin code regex
        String pin = "583219";
        if (isValidPinCode(pin)) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.");
        }
    }
}
