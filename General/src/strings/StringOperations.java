package strings;

import java.util.Scanner;

public class StringOperations {

    private static String findVowels(String input) {
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    private static int countWords(String input) {
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the delimiter character: ");
        String delimiter = scanner.nextLine();

        String[] splitStrings = inputString.split(delimiter);
        System.out.println("1. Split input string using delimiter:");
        for (String split : splitStrings) {
            System.out.println(split);
        }

        String vowels = findVowels(inputString);
        System.out.println("\n2. Vowels in the input string: " + vowels);

        int wordCount = countWords(inputString);
        System.out.println("\n3. Number of words in the input string: " + wordCount);

        int charCount = inputString.length();
        System.out.println("\n4. Number of characters in the input string: " + charCount);

        scanner.close();
    }


}
