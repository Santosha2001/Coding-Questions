package com.xworkz.number;

public class OddOrEven {

    public static void oddEvenCheck(int number) {
        System.out.println("Odd or Even Check:");

        if (number % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
    }

    public static void main(String[] args) {

        oddEvenCheck(6);
    }

    public static class PrimeNumber {

        private static boolean isPrime = true;

        public static void primeCheck(int number) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println((isPrime) ? "Prime number." : "Not a Prime number.");
        }

        public static void main(String[] args) {

            primeCheck(21);

        }
    }

    public static class ReverseNumber {

        public static void reverseNumber(int number) {
            System.out.println("Reverse number.");

            int originalNumber = number;
            int reverseNumber = 0;

            while (number != 0) {
                reverseNumber = reverseNumber * 10 + number % 10;
                number = number / 10;
            }
            System.out.println("Original number: " + originalNumber);
            System.out.println("reverse number: " + reverseNumber);
        }

        public static void main(String[] args) {

            reverseNumber(9016);

        }
    }
}
