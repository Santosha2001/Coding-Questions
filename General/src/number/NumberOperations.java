package number;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first set of numbers separated by spaces: ");
        String input1 = scanner.nextLine();
        double[] numbers1 = Arrays.stream(input1.split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Arrays.sort(numbers1);
        System.out.println("1. Sorted in descending order: " + Arrays.toString(reverse(numbers1)));

        System.out.print("\nEnter the second number: ");
        double input2 = scanner.nextDouble();
        double roundedNumber = roundToTwoDigits(input2);
        System.out.println("2. Rounded off to 2 digits: " + roundedNumber);

        // Step 3: Take the third input, convert to BigDecimal, subtract, and print the value
        System.out.print("\nEnter the third number: ");
        double input3 = scanner.nextDouble();
        BigDecimal bigDecimalInput3 = new BigDecimal(input3);
        BigDecimal subtractionResult = bigDecimalInput3.subtract(BigDecimal.ONE);
        System.out.println("3. Result after subtracting 1: " + subtractionResult);

        // Step 4: Take the fourth input and sort in ascending order
        System.out.print("\nEnter the fourth set of numbers separated by spaces: ");
        String input4 = scanner.nextLine(); // Consume the previous newline character
        input4 = scanner.nextLine();
        double[] numbers4 = Arrays.stream(input4.split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Arrays.sort(numbers4);
        System.out.println("4. Sorted in ascending order: " + Arrays.toString(numbers4));

        scanner.close();
    }

    private static double[] reverse(double[] array) {
        int length = array.length;
        double[] reversedArray = new double[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        return reversedArray;
    }

    private static double roundToTwoDigits(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
