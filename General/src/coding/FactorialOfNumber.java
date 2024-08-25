package coding;

public class FactorialOfNumber {

    /* factorial using recursion */
    public static int factorialWithRecursion(int number){
        if ((number > 0)){
            return number *factorialWithRecursion(number-1);
        } return 1;
    }

    /* factorial without recursion */
    public static void factorial(int number){

    }

    public static void main(String[] args) {

        System.out.println("FACTORIAL WITH RECURSION.");
        System.out.println(factorialWithRecursion(4))
        ;
    }
}
