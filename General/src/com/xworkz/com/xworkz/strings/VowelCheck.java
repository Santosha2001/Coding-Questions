package com.xworkz.com.xworkz.strings;

public class VowelCheck {

    public static void vowelInString(String input) {
        String inputLowerCase = input.toLowerCase();
        String vowels = "aeiou";

        //count number of vowels present.
        int count = 0;

        for (int i = 0; i < inputLowerCase.length(); i++) {
            char character = inputLowerCase.charAt(i);

            //checks vowel is present or not
            if (vowels.contains(Character.toString(character))) {
                count++;
                System.out.print(character + ", ");
                System.out.println();
            }

        }

        System.out.println("number of vowels present: " + count);

    }

    public static void main(String[] args) {

        vowelInString("Hello world");
    }
}
