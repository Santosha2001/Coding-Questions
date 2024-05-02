package com.xworkz.com.xworkz.strings;

import java.util.HashSet;

//vowels in a string without repeating
public class PrintVowelsInString {

    public static HashSet<Character> vowelsInAString(String input) {

        String vowels = "aeiouAEIOU";
        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.toLowerCase().indexOf(c) != -1) {
                characters.add(c);
            }
        }

        return characters;
    }

    public static void main(String[] args) {
        System.out.println("PRINT VOWELS IN A STRING WITHOUT REPEATING.\n");

        HashSet<Character> characters = vowelsInAString("Java Is A Programming Language.");
        //characters.forEach(System.out::println);
        for (Character character : characters) {
            System.out.print(character + ", ");
        }

    }
}
