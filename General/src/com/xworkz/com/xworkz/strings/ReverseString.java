package com.xworkz.com.xworkz.strings;

public class ReverseString {

    // using charAt() method
    public static void reverseString(String inputString) {
        String originalString = inputString;
        String reverseString = "";
        int originalStringLength = originalString.length();

        for (int i = originalStringLength - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println("Original string: " + originalString);
        System.out.println("Reverse string: " + reverseString);
        System.out.println("______________");
    }

    // using String Builder class
    public static void reverseStringWithBuilder(String input) {
        StringBuilder builder = new StringBuilder();

        char[] charArray = input.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            builder.append(charArray[i]);
        }
        System.out.println("Input String: " + input);
        System.out.println("Reverse string: " + builder);
    }

    public static void main(String[] args) {

        reverseString("gadag");

        reverseStringWithBuilder("santhu");
    }
}
