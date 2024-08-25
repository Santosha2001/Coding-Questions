package number;

public class FactorialOfNumber {

    public static void factorial(int number) {
        System.out.println("Factorial of number:");
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {

        factorial(5);
    }
}
