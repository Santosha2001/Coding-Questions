package pattern;

public class RotatedNumberPattern {

    public static void main(String[] args) {
        int n = 5; // You can change this value to generate a larger or smaller pattern

        // Printing the increasing part of the pattern
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printNumbers(i);
            System.out.println();
        }

        // Printing the decreasing part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            printNumbers(i);
            System.out.println();
        }
    }

    // Method to print spaces
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
    }

    // Method to print numbers
    private static void printNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " ");
        }
    }
}
