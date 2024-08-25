package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static void main(String[] args) {
        // Regular expressions
        String emailPattern = "^\\w+([\\.-]?\\w+)@\\w+([\\.-]?\\w+)(\\.\\w{2,3})+$";
        String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        String phonePattern = "^[6-9]\\d{9}$";
        String pincodePattern = "\\b\\d{6}\\b";

        // Sample input data
        String email = "example@example.com";
        String pan = "ABCDE1234F";
        String phoneNumber = "9876543210";
        String pincode = "123456";

        // Validating inputs
        System.out.println("Email Validation: " + validateInput(emailPattern, email));
        System.out.println("PAN Validation: " + validateInput(panPattern, pan));
        System.out.println("Phone Number Validation: " + validateInput(phonePattern, phoneNumber));
        System.out.println("Pincode Validation: " + validateInput(pincodePattern, pincode));
    }

    // Function to validate input using regex
    public static boolean validateInput(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
