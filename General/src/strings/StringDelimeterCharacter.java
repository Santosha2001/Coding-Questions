package strings;

import java.util.Scanner;

public class StringDelimeterCharacter {

    public static String[] delemeteString(String input, String delimiter) {

        String regex = "[" + delimiter.replaceAll("([\\[\\]\\(\\)\\{\\}\\^\\$\\.\\/\\?\\*\\+\\\\])", "\\\\$1") + "]";
        return input.split(regex);
    }

    public static void main(String[] args) {
        System.out.print("Enter the string: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        System.out.print("Enter delimiter character: ");
        String c = scanner.nextLine();

        String[] delemetedString = delemeteString(inputString, c);

        System.out.println("String after delimiting.");
        for (String strings : delemetedString) {
            System.out.println(strings);
        }
    }
}
